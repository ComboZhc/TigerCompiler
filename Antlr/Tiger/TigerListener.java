// Generated from Tiger.g4 by ANTLR 4.0
package Antlr.Tiger;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface TigerListener extends ParseTreeListener {
	void enterMethodDec(TigerParser.MethodDecContext ctx);
	void exitMethodDec(TigerParser.MethodDecContext ctx);

	void enterClassDec(TigerParser.ClassDecContext ctx);
	void exitClassDec(TigerParser.ClassDecContext ctx);

	void enterArrayType(TigerParser.ArrayTypeContext ctx);
	void exitArrayType(TigerParser.ArrayTypeContext ctx);

	void enterDecs(TigerParser.DecsContext ctx);
	void exitDecs(TigerParser.DecsContext ctx);

	void enterInitField(TigerParser.InitFieldContext ctx);
	void exitInitField(TigerParser.InitFieldContext ctx);

	void enterExpr(TigerParser.ExprContext ctx);
	void exitExpr(TigerParser.ExprContext ctx);

	void enterAssignExpr(TigerParser.AssignExprContext ctx);
	void exitAssignExpr(TigerParser.AssignExprContext ctx);

	void enterFuncExpr(TigerParser.FuncExprContext ctx);
	void exitFuncExpr(TigerParser.FuncExprContext ctx);

	void enterType(TigerParser.TypeContext ctx);
	void exitType(TigerParser.TypeContext ctx);

	void enterSequenceExpr(TigerParser.SequenceExprContext ctx);
	void exitSequenceExpr(TigerParser.SequenceExprContext ctx);

	void enterBreakExpr(TigerParser.BreakExprContext ctx);
	void exitBreakExpr(TigerParser.BreakExprContext ctx);

	void enterInitFields(TigerParser.InitFieldsContext ctx);
	void exitInitFields(TigerParser.InitFieldsContext ctx);

	void enterIfExpr(TigerParser.IfExprContext ctx);
	void exitIfExpr(TigerParser.IfExprContext ctx);

	void enterDec(TigerParser.DecContext ctx);
	void exitDec(TigerParser.DecContext ctx);

	void enterTypeField(TigerParser.TypeFieldContext ctx);
	void exitTypeField(TigerParser.TypeFieldContext ctx);

	void enterFuncDec(TigerParser.FuncDecContext ctx);
	void exitFuncDec(TigerParser.FuncDecContext ctx);

	void enterLetExpr(TigerParser.LetExprContext ctx);
	void exitLetExpr(TigerParser.LetExprContext ctx);

	void enterTypeDec(TigerParser.TypeDecContext ctx);
	void exitTypeDec(TigerParser.TypeDecContext ctx);

	void enterNegateExpr(TigerParser.NegateExprContext ctx);
	void exitNegateExpr(TigerParser.NegateExprContext ctx);

	void enterExprs(TigerParser.ExprsContext ctx);
	void exitExprs(TigerParser.ExprsContext ctx);

	void enterRecordType(TigerParser.RecordTypeContext ctx);
	void exitRecordType(TigerParser.RecordTypeContext ctx);

	void enterTypeID(TigerParser.TypeIDContext ctx);
	void exitTypeID(TigerParser.TypeIDContext ctx);

	void enterExprList(TigerParser.ExprListContext ctx);
	void exitExprList(TigerParser.ExprListContext ctx);

	void enterValueExpr(TigerParser.ValueExprContext ctx);
	void exitValueExpr(TigerParser.ValueExprContext ctx);

	void enterImportDec(TigerParser.ImportDecContext ctx);
	void exitImportDec(TigerParser.ImportDecContext ctx);

	void enterWhileExpr(TigerParser.WhileExprContext ctx);
	void exitWhileExpr(TigerParser.WhileExprContext ctx);

	void enterNewExpr(TigerParser.NewExprContext ctx);
	void exitNewExpr(TigerParser.NewExprContext ctx);

	void enterPrimitiveDec(TigerParser.PrimitiveDecContext ctx);
	void exitPrimitiveDec(TigerParser.PrimitiveDecContext ctx);

	void enterTypeFields(TigerParser.TypeFieldsContext ctx);
	void exitTypeFields(TigerParser.TypeFieldsContext ctx);

	void enterVarDec(TigerParser.VarDecContext ctx);
	void exitVarDec(TigerParser.VarDecContext ctx);

	void enterClassFields(TigerParser.ClassFieldsContext ctx);
	void exitClassFields(TigerParser.ClassFieldsContext ctx);

	void enterClassField(TigerParser.ClassFieldContext ctx);
	void exitClassField(TigerParser.ClassFieldContext ctx);

	void enterArrayInitializer(TigerParser.ArrayInitializerContext ctx);
	void exitArrayInitializer(TigerParser.ArrayInitializerContext ctx);

	void enterLvalue(TigerParser.LvalueContext ctx);
	void exitLvalue(TigerParser.LvalueContext ctx);

	void enterProgram(TigerParser.ProgramContext ctx);
	void exitProgram(TigerParser.ProgramContext ctx);

	void enterRecordInitializer(TigerParser.RecordInitializerContext ctx);
	void exitRecordInitializer(TigerParser.RecordInitializerContext ctx);

	void enterMethodExpr(TigerParser.MethodExprContext ctx);
	void exitMethodExpr(TigerParser.MethodExprContext ctx);

	void enterForID(TigerParser.ForIDContext ctx);
	void exitForID(TigerParser.ForIDContext ctx);

	void enterFuncBody(TigerParser.FuncBodyContext ctx);
	void exitFuncBody(TigerParser.FuncBodyContext ctx);

	void enterForExpr(TigerParser.ForExprContext ctx);
	void exitForExpr(TigerParser.ForExprContext ctx);
}