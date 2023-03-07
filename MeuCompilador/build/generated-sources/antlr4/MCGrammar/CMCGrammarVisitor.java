
package MCGrammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public interface CMCGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CMCGrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#includes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludes(CMCGrammarParser.IncludesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#globals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobals(CMCGrammarParser.GlobalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(CMCGrammarParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(CMCGrammarParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CMCGrammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CMCGrammarParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CMCGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclart}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclart(CMCGrammarParser.VarDeclartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrLine(CMCGrammarParser.AttrLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputLine(CMCGrammarParser.InputLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outputLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputLine(CMCGrammarParser.OutputLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLine(CMCGrammarParser.ExprLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfLine(CMCGrammarParser.IfLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLine(CMCGrammarParser.WhileLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLine(CMCGrammarParser.ForLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnLine(CMCGrammarParser.ReturnLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncLine(CMCGrammarParser.FuncLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrExpr}
	 * labeled alternative in {@link CMCGrammarParser#attribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrExpr(CMCGrammarParser.AttrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrStr}
	 * labeled alternative in {@link CMCGrammarParser#attribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrStr(CMCGrammarParser.AttrStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(CMCGrammarParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(CMCGrammarParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printSTR}
	 * labeled alternative in {@link CMCGrammarParser#outputType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSTR(CMCGrammarParser.PrintSTRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printID}
	 * labeled alternative in {@link CMCGrammarParser#outputType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintID(CMCGrammarParser.PrintIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CMCGrammarParser#outputType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(CMCGrammarParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iffStmt}
	 * labeled alternative in {@link CMCGrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIffStmt(CMCGrammarParser.IffStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmtElse}
	 * labeled alternative in {@link CMCGrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmtElse(CMCGrammarParser.IfStmtElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileeStmt}
	 * labeled alternative in {@link CMCGrammarParser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileeStmt(CMCGrammarParser.WhileeStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forrStmt}
	 * labeled alternative in {@link CMCGrammarParser#forstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForrStmt(CMCGrammarParser.ForrStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#callfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallfunction(CMCGrammarParser.CallfunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnVal}
	 * labeled alternative in {@link CMCGrammarParser#retrn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVal(CMCGrammarParser.ReturnValContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CMCGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#assignOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOP(CMCGrammarParser.AssignOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link CMCGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlus(CMCGrammarParser.ExprPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMinum}
	 * labeled alternative in {@link CMCGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinum(CMCGrammarParser.ExprMinumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTerm}
	 * labeled alternative in {@link CMCGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTerm(CMCGrammarParser.ExprTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termDiv}
	 * labeled alternative in {@link CMCGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermDiv(CMCGrammarParser.TermDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termMod}
	 * labeled alternative in {@link CMCGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermMod(CMCGrammarParser.TermModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termFactor}
	 * labeled alternative in {@link CMCGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermFactor(CMCGrammarParser.TermFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termMult}
	 * labeled alternative in {@link CMCGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermMult(CMCGrammarParser.TermMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprParnt}
	 * labeled alternative in {@link CMCGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParnt(CMCGrammarParser.ExprParntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorId}
	 * labeled alternative in {@link CMCGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorId(CMCGrammarParser.FactorIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorNum}
	 * labeled alternative in {@link CMCGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorNum(CMCGrammarParser.FactorNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorStr}
	 * labeled alternative in {@link CMCGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorStr(CMCGrammarParser.FactorStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueValue}
	 * labeled alternative in {@link CMCGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueValue(CMCGrammarParser.TrueValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseValue}
	 * labeled alternative in {@link CMCGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseValue(CMCGrammarParser.FalseValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpres}
	 * labeled alternative in {@link CMCGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpres(CMCGrammarParser.BoolExpresContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMCGrammarParser#incr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncr(CMCGrammarParser.IncrContext ctx);
}