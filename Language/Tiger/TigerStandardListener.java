package Language.Tiger;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import Antlr.Tiger.TigerBaseListener;
import Antlr.Tiger.TigerParser;
import Antlr.Tiger.TigerParser.ArrayInitializerContext;
import Antlr.Tiger.TigerParser.AssignExprContext;
import Antlr.Tiger.TigerParser.ExprContext;
import Antlr.Tiger.TigerParser.ExprListContext;
import Antlr.Tiger.TigerParser.ExprsContext;
import Antlr.Tiger.TigerParser.ForExprContext;
import Antlr.Tiger.TigerParser.FuncExprContext;
import Antlr.Tiger.TigerParser.IfExprContext;
import Antlr.Tiger.TigerParser.InitFieldContext;
import Antlr.Tiger.TigerParser.InitFieldsContext;
import Antlr.Tiger.TigerParser.MethodExprContext;
import Antlr.Tiger.TigerParser.NegateExprContext;
import Antlr.Tiger.TigerParser.NewExprContext;
import Antlr.Tiger.TigerParser.ProgramContext;
import Antlr.Tiger.TigerParser.SequenceExprContext;
import Antlr.Tiger.TigerParser.TypeIDContext;
import Antlr.Tiger.TigerParser.TypeInitializerContext;
import Antlr.Tiger.TigerParser.ValueExprContext;
import Antlr.Tiger.TigerParser.WhileExprContext;

import static Language.Tiger.TigerType.ARRAY;
import static Language.Tiger.TigerType.BOOLEAN;
import static Language.Tiger.TigerType.INTEGER;
import static Language.Tiger.TigerType.NIL;
import static Language.Tiger.TigerType.NOVALUE;
import static Language.Tiger.TigerType.RECORD;
import static Language.Tiger.TigerType.STRING;

public class TigerStandardListener extends TigerBaseListener {
	private List<Map<String, TigerNamespace>> tables;
	private ParseTreeProperty<TigerType> values;
	
	public TigerStandardListener() {
		this.tables = new LinkedList<Map<String, TigerNamespace>>();
		this.values = new ParseTreeProperty<TigerType>();
	}

	private void warning(ParserRuleContext ctx, String msg) {
		System.out.println(msg);
	}
	
	private void error(ParserRuleContext ctx, String msg) {
		System.out.println(msg);
	}
	
	private TigerType eval(ParserRuleContext ctx) {
		return this.values.get(ctx);
	}
	
	private void assign(ParserRuleContext ctx, TigerType tp) {
		this.values.put(ctx, tp);
	}
	
	private Map<String, TigerNamespace> currentTable() {
		return this.tables.get(this.tables.size() - 1);
	}
	
	private Map<String, TigerNamespace> visibleTable() {
		Map<String, TigerNamespace> table = new HashMap<String, TigerNamespace>();
		for (Map<String, TigerNamespace> t: tables){
			for (String symbol : t.keySet())
				table.put(symbol, t.get(symbol));
		}
		return table;
	}
	
	@Override
	public void enterProgram(ProgramContext ctx) {
		HashMap<String, TigerNamespace> map = new HashMap<String, TigerNamespace>();
		map.put("int", INTEGER);
		map.put("string", STRING);
		this.tables.add(map);
	}
	
	@Override
	public void exitProgram(ProgramContext ctx) {
		this.tables.remove(this.tables.size() - 1);
	}
	
	@Override
	public void exitExprList(ExprListContext ctx) {
		assign(ctx, NOVALUE);
	}
	
	@Override
	public void exitExprs(ExprsContext ctx) {
		if (ctx.expr() == null || ctx.expr().isEmpty())
			assign(ctx, NOVALUE);
		else
			assign(ctx, eval(ctx.expr(ctx.expr().size() - 1)));
	}

	@Override
	public void exitExpr(ExprContext ctx) {
		if (ctx.OR() != null || 
			ctx.AND() != null || 
			ctx.PLUS() != null || 
			ctx.MINUS() != null || 
			ctx.MUL() != null ||
			ctx.DIV() != null) {
			TigerType lt = eval(ctx.expr(0));
			TigerType rt = eval(ctx.expr(1));
			if (!lt.equals(INTEGER)) {
				error(ctx.expr(0), "Must be " + INTEGER);
			}
			if (!rt.equals(INTEGER)) {
				error(ctx.expr(1), "Must be " + INTEGER);
			}
			assign(ctx, INTEGER);
		} else if (ctx.EQ() != null ||
			ctx.NEQ() != null ||
			ctx.LT() != null ||
			ctx.LE() != null ||
			ctx.GT() != null ||
			ctx.GE() != null) {
			TigerType lt = eval(ctx.expr(0));
			TigerType rt = eval(ctx.expr(1));
			// TODO: Nil
			if (!lt.equals(rt)) {
				error(ctx, "Cannot compare " + lt + " with " + rt);
			} else if (lt instanceof TigerBoolean || rt instanceof TigerBoolean) {
				warning(ctx, "Relation operators are not associative");
				assign(ctx, BOOLEAN);
			} else {
				//PASS
				assign(ctx, BOOLEAN);
			}
		} else if (ctx.NIL() != null) {
			assign(ctx, NIL);
		} else if (ctx.INT() != null) {
			assign(ctx, INTEGER);
		} else if (ctx.STRING() != null) {
			assign(ctx, STRING);
		} else if (ctx.arrayInitializer() != null) {
			assign(ctx, eval(ctx.arrayInitializer()));
		} else if (ctx.typeInitializer() != null) {
			assign(ctx, eval(ctx.typeInitializer()));
		} else if (ctx.negateExpr() != null) {
			assign(ctx, eval(ctx.negateExpr()));
		} else if (ctx.newExpr() != null) {
			assign(ctx, eval(ctx.newExpr()));
		} else if (ctx.sequenceExpr() != null) {
			assign(ctx, eval(ctx.sequenceExpr()));
		} else if (ctx.assignExpr() != null) {
			assign(ctx, eval(ctx.assignExpr()));
		} else if (ctx.valueExpr() != null) {
			assign(ctx, eval(ctx.valueExpr()));
		} else if (ctx.funcExpr() != null) {
			assign(ctx, eval(ctx.funcExpr()));
		} else if (ctx.methodExpr() != null) {
			assign(ctx, eval(ctx.methodExpr()));
		} else if (ctx.ifExpr() != null) {
			assign(ctx, eval(ctx.ifExpr()));
		} else if (ctx.whileExpr() != null) {
			assign(ctx, eval(ctx.whileExpr()));
		} else if (ctx.forExpr() != null) {
			assign(ctx, eval(ctx.forExpr()));
		} else if (ctx.breakExpr() != null) {
			assign(ctx, eval(ctx.breakExpr()));
		} else if (ctx.letExpr() != null) {
			assign(ctx, eval(ctx.letExpr()));
		}
	}

	@Override
	public void exitArrayInitializer(ArrayInitializerContext ctx) {
		Map<String, TigerNamespace> table = visibleTable();
		String symbol = ctx.typeID().getText();
		TigerType indices = eval(ctx.expr(0));
		TigerType elementType = eval(ctx.expr(1));

		TigerArray arr = null;
		if (table.containsKey(symbol)) {
			if (table.get(symbol) instanceof TigerArray) {
				arr = (TigerArray)table.get(symbol);
				if (!indices.equals(INTEGER)) {
					error(ctx, "Indices must be " + INTEGER);
				} else if (!elementType.equals(arr.getElementType())) {
					error(ctx, "Array element type mismatch");
				} else {
					// PASS
					assign(ctx, arr);
				}
			} else {
				error(ctx, "Array " + symbol + " is not " + ARRAY);
			}
		} else {
			error(ctx, "Array " + symbol + "is not defind");
		}
	}

	@Override
	public void exitTypeInitializer(TypeInitializerContext ctx) {
		Map<String, TigerNamespace> table = visibleTable();
		String symbol = ctx.typeID().getText();
		
		Map<String, TigerType> initFields = new HashMap<String, TigerType>();
		for (TigerParser.InitFieldContext f : ctx.initFields().initField()) {
			initFields.put(f.ID().getText(), eval(f.expr()));
		}
		
		TigerRecord record = null;
		if (table.containsKey(symbol)) {
			if (table.get(symbol) instanceof TigerArray) {
				record = (TigerRecord)table.get(symbol);
				if (record.getElementTypes().equals(initFields)) {
					warning(ctx, "Record init fields mismatch");
				} else {
					// PASS
					assign(ctx, record);
				}
			} else {
				error(ctx, "TypeID" + symbol + " is not " + ARRAY);
			}
		} else {
			error(ctx, "TypeID " + symbol + " is not defind");
		}
	}

	@Override
	public void exitNegateExpr(NegateExprContext ctx) {
		TigerType t = eval(ctx.expr());
		if (t.equals(INTEGER)) {
			// PASS
			assign(ctx, INTEGER);
		} else {
			error(ctx.expr(), " Must be " + INTEGER);
		}
	}
	
	@Override
	public void exitNewExpr(NewExprContext ctx) {
		assign(ctx, NOVALUE);
	}
	
	@Override
	public void exitSequenceExpr(SequenceExprContext ctx) {
		assign(ctx, eval(ctx.exprs()));
	}
	
	@Override
	public void exitAssignExpr(AssignExprContext ctx) {
		TigerType lt = eval(ctx.lvalue());
		TigerType rt = eval(ctx.expr());
		if (lt.equals(rt)) {
			// PASS
			assign(ctx, NOVALUE);
		} else {
			error(ctx, "Type mismatch");
		}
	}
	
	@Override
	public void exitValueExpr(ValueExprContext ctx) {
		assign(ctx, eval(ctx.lvalue()));
	}
	
	@Override
	public void exitFuncExpr(FuncExprContext ctx) {
		Map<String, TigerNamespace> table = visibleTable();
		String symbol = ctx.ID().getText();

		List<TigerType> parameters = new LinkedList<TigerType>();
		for (TigerParser.ExprContext e : ctx.exprList().expr()) {
			parameters.add(eval(e));
		}
		
		TigerFunction func = null;
		if (table.containsKey(symbol)) {
			if (table.get(symbol) instanceof TigerFunction) {
				func = (TigerFunction)table.get(symbol);
				if (func.getParameterTypes().equals(parameters)) {
					error(ctx, "Parameter types mismatch");
				} else {
					// PASS
					assign(ctx, func.getReturnType());
				}
			} else {
				error(ctx, "Function" + symbol + " is not " + ARRAY);
			}
		} else {
			error(ctx, "Function " + symbol + " is not defind");
		}
	}
	
	@Override
	public void exitMethodExpr(MethodExprContext ctx) {
		// TODO
		assign(ctx, NOVALUE);
	}
	
	@Override
	public void exitIfExpr(IfExprContext ctx) {
		TigerType conditionType = eval(ctx.expr(0));
		if (conditionType.equals(INTEGER)) {
			if (ctx.ELSE() != null) {
				TigerType leftBranchType = eval(ctx.expr(1));
				TigerType rightBranchType = eval(ctx.expr(2));
				if (leftBranchType.equals(rightBranchType)) {
					// PASS
					assign(ctx, leftBranchType);
				} else {
					warning(ctx, "Branches types mismatch");
					assign(ctx, leftBranchType);
				}
			} else {
				TigerType branchType = eval(ctx.expr(1));
				if (branchType.equals(NOVALUE)) {
					// PASS
					assign(ctx, NOVALUE);
				} else {
					warning(ctx, "Branch should be " + NOVALUE);
					assign(ctx, NOVALUE);
				}
			}
		} else {
			error(ctx, "Condition should be " + INTEGER);
		}
	}
	
	@Override
	public void exitWhileExpr(WhileExprContext ctx) {
		TigerType conditionType = eval(ctx.expr(0));
		if (conditionType.equals(INTEGER)) {
			TigerType bodyType = eval(ctx.expr(1));
			if (bodyType.equals(NOVALUE)) {
				assign(ctx, NOVALUE);
			} else {
				warning(ctx, "Loop body should be " + NOVALUE);
				assign(ctx, NOVALUE);
			}
		} else {
			error(ctx, "Condition should be " + INTEGER);
		}
	}
	
	@Override
	public void exitForExpr(ForExprContext ctx) {
		
	}

	@Override
	public void exitInitField(InitFieldContext ctx) {
		assign(ctx, NOVALUE);
	}

	@Override
	public void exitInitFields(InitFieldsContext ctx) {
		assign(ctx, NOVALUE);
	}

	@Override
	public void exitTypeID(TypeIDContext ctx) {
		assign(ctx, NOVALUE);
	}
}
