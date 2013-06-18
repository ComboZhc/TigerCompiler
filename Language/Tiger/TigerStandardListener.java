package Language.Tiger;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.CSS;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.compiler.CodeGenerator.includeExpr_return;
import org.stringtemplate.v4.compiler.STParser.andConditional_return;

import com.sun.corba.se.impl.orbutil.graph.Node;
import com.sun.org.apache.xml.internal.utils.NameSpace;

import Antlr.Tiger.TigerBaseListener;
import Antlr.Tiger.TigerParser;
import Antlr.Tiger.TigerParser.ArrayInitializerContext;
import Antlr.Tiger.TigerParser.AssignExprContext;
import Antlr.Tiger.TigerParser.BreakExprContext;
import Antlr.Tiger.TigerParser.ClassDecContext;
import Antlr.Tiger.TigerParser.DecContext;
import Antlr.Tiger.TigerParser.DecsContext;
import Antlr.Tiger.TigerParser.ExprContext;
import Antlr.Tiger.TigerParser.ExprListContext;
import Antlr.Tiger.TigerParser.ExprsContext;
import Antlr.Tiger.TigerParser.ForExprContext;
import Antlr.Tiger.TigerParser.ForIDContext;
import Antlr.Tiger.TigerParser.FuncDecContext;
import Antlr.Tiger.TigerParser.FuncExprContext;
import Antlr.Tiger.TigerParser.IfExprContext;
import Antlr.Tiger.TigerParser.ImportDecContext;
import Antlr.Tiger.TigerParser.InitFieldContext;
import Antlr.Tiger.TigerParser.InitFieldsContext;
import Antlr.Tiger.TigerParser.LetExprContext;
import Antlr.Tiger.TigerParser.LvalueContext;
import Antlr.Tiger.TigerParser.MethodDecContext;
import Antlr.Tiger.TigerParser.MethodExprContext;
import Antlr.Tiger.TigerParser.NegateExprContext;
import Antlr.Tiger.TigerParser.NewExprContext;
import Antlr.Tiger.TigerParser.PrimitiveDecContext;
import Antlr.Tiger.TigerParser.ProgramContext;
import Antlr.Tiger.TigerParser.RecordInitializerContext;
import Antlr.Tiger.TigerParser.SequenceExprContext;
import Antlr.Tiger.TigerParser.TypeContext;
import Antlr.Tiger.TigerParser.TypeDecContext;
import Antlr.Tiger.TigerParser.TypeFieldContext;
import Antlr.Tiger.TigerParser.TypeFieldsContext;
import Antlr.Tiger.TigerParser.TypeIDContext;
import Antlr.Tiger.TigerParser.ValueExprContext;
import Antlr.Tiger.TigerParser.VarDecContext;
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

	private String quote(Object o) {
		return "'" + o.toString() + "'";
	}
	
	private String envelope(Object o){
		return "(" + o.toString() + ")";
	}
	
	private Token getSymbol(ParserRuleContext ctx) {
		ParseTree tree = ctx;
		while (!(tree instanceof TerminalNode)) {
			tree = tree.getChild(0);
		}
		TerminalNode node = (TerminalNode)tree;
		return node.getSymbol();
	}
	
	private void warning(ParserRuleContext ctx, String msg) {
		System.out.println("line " + getSymbol(ctx).getLine() + " WARNING: " + msg);
	}
	
	private void error(ParserRuleContext ctx, String msg) {
		System.out.println("line " + getSymbol(ctx).getLine() + " ERROR: " + msg);
		System.exit(-1);
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
	
	private void pushTable() {
		tables.add(new HashMap<String, TigerNamespace>());
	}
	
	private void popTable() {
		tables.remove(tables.size() - 1);
	}
	
	private TigerFunction getFunctionOrError(ParserRuleContext ctx, Map<String, TigerNamespace> table, String funcID){
		if (table.get(funcID) instanceof TigerType)
			return (TigerFunction)table.get(funcID);
		else  {
			error(ctx, quote(funcID) + " must be FUNCTION");
			return null;
		}
	}
	
	private TigerType getTypeOrError(ParserRuleContext ctx, Map<String, TigerNamespace> table, String typeID){
		if (table.get(typeID) instanceof TigerType)
			return (TigerType)table.get(typeID);
		else  {
			error(ctx, quote(typeID) + " must be TypeID");
			return null;
		}
	}
	
	@Override
	public void enterProgram(ProgramContext ctx) {
		pushTable();
		currentTable().put("int", INTEGER);
		currentTable().put("string", STRING);
	}
	
	@Override
	public void exitProgram(ProgramContext ctx) {
		popTable();
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
				error(ctx.expr(0), quote(ctx.expr(0)) + "Must be " + INTEGER);
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
			if (lt instanceof TigerRecord && rt instanceof TigerRecord) {
				boolean lnil = ((TigerRecord)lt).isNil();
				boolean rnil = ((TigerRecord)rt).isNil();
				if ((!lnil && rnil) || (lnil && !rnil)) {
					// PASS
				} else if (lnil && rnil){
					warning(ctx, "Cannot compare " + lt + envelope(ctx.expr(0).getText()) + " with " + rt + envelope(ctx.expr(1).getText()));
				} else if (!lt.equals(rt)) {
					warning(ctx, "Cannot compare " + lt + envelope(ctx.expr(0).getText()) + " with " + rt + envelope(ctx.expr(1).getText()));
				}
			} else if (!lt.equals(rt)) {
				warning(ctx, "Cannot compare " + lt + envelope(ctx.expr(0).getText()) + " with " + rt + envelope(ctx.expr(1).getText()));
			} else if (lt instanceof TigerBoolean || rt instanceof TigerBoolean) {
				warning(ctx, "Relation operators are not associative");
			}
			assign(ctx, BOOLEAN);
		} else if (ctx.NIL() != null) {
			assign(ctx, NIL);
		} else if (ctx.INT() != null) {
			assign(ctx, INTEGER);
		} else if (ctx.STRING() != null) {
			assign(ctx, STRING);
		} else if (ctx.arrayInitializer() != null) {
			assign(ctx, eval(ctx.arrayInitializer()));
		} else if (ctx.recordInitializer() != null) {
			assign(ctx, eval(ctx.recordInitializer()));
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
		String typeID = ctx.typeID().getText();
		TigerType indices = eval(ctx.expr(0));
		TigerType elementType = eval(ctx.expr(1));

		TigerArray arr = null;
		TigerType type = getTypeOrError(ctx, table, typeID);
		if (type instanceof TigerArray) {
			arr = (TigerArray)type;
			if (!indices.equals(INTEGER)) {
				error(ctx, "Indices must be " + INTEGER);
			} else if (!elementType.equals(arr.getElementType())) {
				error(ctx, "Array element type mismatch");
			} else {
				// PASS
				assign(ctx, arr);
			}
		} else {
			error(ctx, "'" + typeID + "' is not " + ARRAY);
		}
	}

	@Override
	public void exitRecordInitializer(RecordInitializerContext ctx) {
		Map<String, TigerNamespace> table = visibleTable();
		String typeID = ctx.typeID().getText();
		
		Map<String, TigerType> initFields = new HashMap<String, TigerType>();
		for (TigerParser.InitFieldContext f : ctx.initFields().initField()) {
			initFields.put(f.ID().getText(), eval(f.expr()));
		}
		
		TigerRecord record = null;
		TigerType type = getTypeOrError(ctx, table, typeID);
		if (type instanceof TigerRecord) {
			record = (TigerRecord)type;
			if (record.getElementTypes().equals(initFields)) {
				warning(ctx, "Record init fields mismatch");
			} else {
				// PASS
				assign(ctx, record);
			}
		} else {
			error(ctx, "'" + typeID + "' is not " + RECORD);
		}
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
		} else if (rt instanceof TigerRecord
			&& (((TigerRecord)rt).isNil()) 
			&& (lt instanceof TigerRecord)) {
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
		String funcID = ctx.ID().getText();

		List<TigerType> parameters = new LinkedList<TigerType>();
		for (TigerParser.ExprContext e : ctx.exprList().expr()) {
			parameters.add(eval(e));
		}
		
		TigerFunction func = getFunctionOrError(ctx, table, funcID);
		if (func.getParameterTypes().equals(parameters)) {
			error(ctx, "Parameter types mismatch");
		} else {
			// PASS
			assign(ctx, func.getReturnType());
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
		if (!conditionType.equals(INTEGER)) {
			error(ctx, "Condition should be " + INTEGER);
		} else if (ctx.ELSE() != null) {
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
	}
	
	@Override
	public void exitWhileExpr(WhileExprContext ctx) {
		TigerType conditionType = eval(ctx.expr(0));
		TigerType bodyType = eval(ctx.expr(1));
		if (!conditionType.equals(INTEGER)) {
			error(ctx, "Condition should be " + INTEGER);
		} else if (!bodyType.equals(NOVALUE)) {
			warning(ctx, "Loop body should be " + NOVALUE);
			assign(ctx, NOVALUE);
		} else {
			assign(ctx, NOVALUE);
		}
			
	}
	
	@Override
	public void enterForExpr(ForExprContext ctx) {
		pushTable();
	}
	
	
	@Override
	public void exitForExpr(ForExprContext ctx) {
		TigerType lowerBoundType = eval(ctx.expr(0));
		TigerType upperBoundType = eval(ctx.expr(1));
		TigerType bodyType = eval(ctx.expr(2));
		if (!lowerBoundType.equals(INTEGER)) {
			error(ctx.expr(0), "Lowerbound should be " + INTEGER);
		} else if (!upperBoundType.equals(INTEGER)) {
			error(ctx.expr(1), "Upperbound should be " + INTEGER);
		} else if (!bodyType.equals(NOVALUE)) {
			error(ctx.expr(2), "Body should be " + NOVALUE);
		} else {
			// PASS
			assign(ctx, NOVALUE);
		}
		popTable();
	}
	
	@Override
	public void exitForID(ForIDContext ctx) {
		currentTable().put(ctx.ID().getText(), INTEGER);
	}

	@Override
	public void exitBreakExpr(BreakExprContext ctx) {
		ParserRuleContext parent = ctx;
		boolean insideLoop = false;
		while (parent != null) {
			parent = parent.getParent();
			if (parent instanceof WhileExprContext || parent instanceof ForExprContext) {
				insideLoop = true;
				break;
			}
		}
		if (!insideLoop) 
			error(ctx, "Break should be inside loop");
		assign(ctx, NOVALUE);
	}
	
	@Override
	public void enterLetExpr(LetExprContext ctx) {
		pushTable();
	}
	
	@Override
	public void exitLetExpr(LetExprContext ctx) {
		assign(ctx, eval(ctx.exprs()));
		popTable();
	}
	
	@Override
	public void exitLvalue(LvalueContext ctx) {
		Map<String, TigerNamespace> table = visibleTable();
		String rootKey = ctx.ID(0).getText();
		TigerType rootType = null;
		String path = rootKey;
		if (table.containsKey(rootKey) && table.get(rootKey) instanceof TigerVariable)
			rootType = ((TigerVariable)table.get(rootKey)).getType();
		else 
			error(ctx, quote(rootKey) + " should be VARIABLE");
		for (int i = 1; i < ctx.getChildCount(); i++) {
			ParseTree parseTree = ctx.getChild(i);
			if (parseTree instanceof TerminalNode) {
				TerminalNode terminalNode = (TerminalNode)parseTree;
				if (terminalNode.getSymbol().getType() == TigerParser.ID) {
					String idString = terminalNode.getText();
					if (rootType instanceof TigerRecord) {
						TigerRecord record = (TigerRecord)rootType;
						if (record.getElementTypes().containsKey(idString)) {
							// PASS
							rootType = record.getElementTypes().get(idString);
							path += "." + idString;
						} else {
							error(ctx, "Record field '" + idString + "' does not exist");
						}
					} else {
						error(ctx, "'" + path + "' must be " + RECORD);
					}
				}
			} else if (parseTree instanceof ParserRuleContext) {
				ExprContext expr = (ExprContext)parseTree;
				if (rootType instanceof TigerArray) {
					TigerArray array = (TigerArray)rootType;
					if (eval(expr).equals(INTEGER)) {
						// PASS
						rootType = array.getElementType();
						path += "[" + expr.getText() + "]";
					} else {
						error(ctx, "Indices must be " + INTEGER);
					}
				} else {
					error(ctx,  quote(path) + " must be " + ARRAY);
				}
			}
		}
		assign(ctx, rootType);
	}
	
	@Override
	public void exitVarDec(VarDecContext ctx) {
		Map<String, TigerNamespace> table = visibleTable();
		TigerType exprType = eval(ctx.expr());
		if (ctx.COLON() != null) {
			TigerType specType = getTypeOrError(ctx, table, (ctx.typeID().getText()));
			if (exprType.equals(specType)) {
				currentTable().put(ctx.ID().getText(), new TigerVariable(exprType));
			} else {
				error(ctx, "Type and expr mismatch");
			}
		} else if (exprType == NIL) {
			warning(ctx, "Cannot assign NIL to " + quote(ctx.ID().getText()));
		} else {
			// PASS
			currentTable().put(ctx.ID().getText(), new TigerVariable(exprType));
		}
	}
	
	@Override
	public void enterTypeDec(TypeDecContext ctx) {
		if (ctx.type().recordType() != null) {
			pushTable();
		}
	}
	
	@Override
	public void exitTypeDec(TypeDecContext ctx) {
		Map<String, TigerNamespace> table = visibleTable();
		if (ctx.type().typeID() != null) {
			TigerType type = getTypeOrError(ctx, table, ctx.type().typeID().getText());
			currentTable().put(ctx.ID().getText(), type);
		} else if (ctx.type().arrayType() != null) {
			TigerType array = new TigerArray(getTypeOrError(ctx, table, ctx.type().arrayType().typeID().getText()));
			currentTable().put(ctx.ID().getText(), array);
		} else if (ctx.type().recordType() != null) {
			popTable();
			TigerRecord record = new TigerRecord();
			currentTable().put(ctx.ID().getText(), record);
			List<TypeFieldContext> typeFields = ctx.type().recordType().typeFields().typeField();
			for (TypeFieldContext c : typeFields) {
				String fieldString = c.ID().getText();
				TigerType fieldType = getTypeOrError(ctx, table, c.typeID().getText());
				record.getElementTypes().put(fieldString, fieldType);
			}
		}
	}
	
	@Override
	public void enterClassDec(ClassDecContext ctx) {
		// TODO
		pushTable();
	}
	
	@Override
	public void exitClassDec(ClassDecContext ctx) {
		// TODO
		popTable();
	}
	
	@Override
	public void enterFuncDec(FuncDecContext ctx) {
		pushTable();
	}
	
	@Override
	public void exitFuncDec(FuncDecContext ctx) {
		popTable();
		Map<String, TigerNamespace> table = visibleTable();
		TigerFunction function = new TigerFunction();
		List<TypeFieldContext> typeFields = ctx.typeFields().typeField();
		for (TypeFieldContext c : typeFields) {
			TigerType type = getTypeOrError(ctx, table, c.typeID().getText());
			function.getParameterTypes().add(type);
		}
		if (ctx.typeID() != null) {
			function.setReturnType(NOVALUE);
		} else {
			function.setReturnType(getTypeOrError(ctx, table, ctx.typeID().getText()));
		}
		if (currentTable().get(ctx.ID().getText()) instanceof TigerFunction) {
			TigerFunction primitiveFunction = (TigerFunction)currentTable().get(ctx.ID().getText());
			if (primitiveFunction != null && primitiveFunction.isPrimitive()) {
				if (!primitiveFunction.equals(function)) {
					error(ctx, quote(function) + " is inconsistent with its primitive" + quote(primitiveFunction.toString()));
				}
			}
		}
		currentTable().put(ctx.ID().getText(), function);
	}
	
	@Override
	public void enterMethodDec(MethodDecContext ctx) {
		pushTable();
	}
	
	@Override
	public void exitMethodDec(MethodDecContext ctx) {
		popTable();
	}
	
	@Override
	public void exitPrimitiveDec(PrimitiveDecContext ctx) {
		Map<String, TigerNamespace> table = visibleTable();
		TigerFunction function = new TigerFunction();
		function.setPrimitive(true);
		List<TypeFieldContext> typeFields = ctx.typeFields().typeField();
		for (TypeFieldContext c : typeFields) {
			TigerType type = getTypeOrError(ctx, table, c.typeID().getText());
			function.getParameterTypes().add(type);
		}		
		if (ctx.typeID() != null) {
			function.setReturnType(NOVALUE);
		} else {
			function.setReturnType(getTypeOrError(ctx, table, ctx.typeID().getText()));
		}
		currentTable().put(ctx.ID().getText(), function);
	}
	
	@Override
	public void exitImportDec(ImportDecContext ctx) {
		// TODO : Merge symbol tables
	}
	
	@Override 
	public void exitTypeFields(TypeFieldsContext ctx) {
		Map<String, TigerNamespace> table = visibleTable();
		List<TypeFieldContext> typeFields = ctx.typeField();
		for (TypeFieldContext c : typeFields) {
			String idString = c.ID().getText();
			TigerType type = getTypeOrError(ctx, table, c.typeID().getText());
			currentTable().put(idString, type);
		}
	}
	
}
