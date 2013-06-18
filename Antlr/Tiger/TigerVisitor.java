// Generated from Tiger.g4 by ANTLR 4.0
package Antlr.Tiger;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface TigerVisitor<T> extends ParseTreeVisitor<T> {
	T visitMethodDec(TigerParser.MethodDecContext ctx);

	T visitClassDec(TigerParser.ClassDecContext ctx);

	T visitArrayType(TigerParser.ArrayTypeContext ctx);

	T visitDecs(TigerParser.DecsContext ctx);

	T visitInitField(TigerParser.InitFieldContext ctx);

	T visitExpr(TigerParser.ExprContext ctx);

	T visitAssignExpr(TigerParser.AssignExprContext ctx);

	T visitFuncExpr(TigerParser.FuncExprContext ctx);

	T visitType(TigerParser.TypeContext ctx);

	T visitSequenceExpr(TigerParser.SequenceExprContext ctx);

	T visitBreakExpr(TigerParser.BreakExprContext ctx);

	T visitInitFields(TigerParser.InitFieldsContext ctx);

	T visitIfExpr(TigerParser.IfExprContext ctx);

	T visitDec(TigerParser.DecContext ctx);

	T visitTypeField(TigerParser.TypeFieldContext ctx);

	T visitFuncDec(TigerParser.FuncDecContext ctx);

	T visitLetExpr(TigerParser.LetExprContext ctx);

	T visitTypeDec(TigerParser.TypeDecContext ctx);

	T visitNegateExpr(TigerParser.NegateExprContext ctx);

	T visitExprs(TigerParser.ExprsContext ctx);

	T visitRecordType(TigerParser.RecordTypeContext ctx);

	T visitTypeID(TigerParser.TypeIDContext ctx);

	T visitExprList(TigerParser.ExprListContext ctx);

	T visitValueExpr(TigerParser.ValueExprContext ctx);

	T visitImportDec(TigerParser.ImportDecContext ctx);

	T visitWhileExpr(TigerParser.WhileExprContext ctx);

	T visitNewExpr(TigerParser.NewExprContext ctx);

	T visitPrimitiveDec(TigerParser.PrimitiveDecContext ctx);

	T visitTypeFields(TigerParser.TypeFieldsContext ctx);

	T visitVarDec(TigerParser.VarDecContext ctx);

	T visitClassFields(TigerParser.ClassFieldsContext ctx);

	T visitClassField(TigerParser.ClassFieldContext ctx);

	T visitArrayInitializer(TigerParser.ArrayInitializerContext ctx);

	T visitLvalue(TigerParser.LvalueContext ctx);

	T visitProgram(TigerParser.ProgramContext ctx);

	T visitRecordInitializer(TigerParser.RecordInitializerContext ctx);

	T visitMethodExpr(TigerParser.MethodExprContext ctx);

	T visitForID(TigerParser.ForIDContext ctx);

	T visitFuncBody(TigerParser.FuncBodyContext ctx);

	T visitForExpr(TigerParser.ForExprContext ctx);
}