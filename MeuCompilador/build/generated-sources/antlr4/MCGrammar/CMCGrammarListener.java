
package MCGrammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;


public interface CMCGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CMCGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CMCGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#includes}.
	 * @param ctx the parse tree
	 */
	void enterIncludes(CMCGrammarParser.IncludesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#includes}.
	 * @param ctx the parse tree
	 */
	void exitIncludes(CMCGrammarParser.IncludesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#globals}.
	 * @param ctx the parse tree
	 */
	void enterGlobals(CMCGrammarParser.GlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#globals}.
	 * @param ctx the parse tree
	 */
	void exitGlobals(CMCGrammarParser.GlobalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(CMCGrammarParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(CMCGrammarParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(CMCGrammarParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(CMCGrammarParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CMCGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CMCGrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CMCGrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CMCGrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CMCGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CMCGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclart}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclart(CMCGrammarParser.VarDeclartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclart}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclart(CMCGrammarParser.VarDeclartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterAttrLine(CMCGrammarParser.AttrLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitAttrLine(CMCGrammarParser.AttrLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterInputLine(CMCGrammarParser.InputLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitInputLine(CMCGrammarParser.InputLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outputLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterOutputLine(CMCGrammarParser.OutputLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outputLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitOutputLine(CMCGrammarParser.OutputLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterExprLine(CMCGrammarParser.ExprLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitExprLine(CMCGrammarParser.ExprLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterIfLine(CMCGrammarParser.IfLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitIfLine(CMCGrammarParser.IfLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterWhileLine(CMCGrammarParser.WhileLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitWhileLine(CMCGrammarParser.WhileLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterForLine(CMCGrammarParser.ForLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitForLine(CMCGrammarParser.ForLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterReturnLine(CMCGrammarParser.ReturnLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitReturnLine(CMCGrammarParser.ReturnLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterFuncLine(CMCGrammarParser.FuncLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcLine}
	 * labeled alternative in {@link CMCGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitFuncLine(CMCGrammarParser.FuncLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrExpr}
	 * labeled alternative in {@link CMCGrammarParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAttrExpr(CMCGrammarParser.AttrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrExpr}
	 * labeled alternative in {@link CMCGrammarParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAttrExpr(CMCGrammarParser.AttrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrStr}
	 * labeled alternative in {@link CMCGrammarParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAttrStr(CMCGrammarParser.AttrStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrStr}
	 * labeled alternative in {@link CMCGrammarParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAttrStr(CMCGrammarParser.AttrStrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(CMCGrammarParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(CMCGrammarParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(CMCGrammarParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(CMCGrammarParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printSTR}
	 * labeled alternative in {@link CMCGrammarParser#outputType}.
	 * @param ctx the parse tree
	 */
	void enterPrintSTR(CMCGrammarParser.PrintSTRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printSTR}
	 * labeled alternative in {@link CMCGrammarParser#outputType}.
	 * @param ctx the parse tree
	 */
	void exitPrintSTR(CMCGrammarParser.PrintSTRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printID}
	 * labeled alternative in {@link CMCGrammarParser#outputType}.
	 * @param ctx the parse tree
	 */
	void enterPrintID(CMCGrammarParser.PrintIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printID}
	 * labeled alternative in {@link CMCGrammarParser#outputType}.
	 * @param ctx the parse tree
	 */
	void exitPrintID(CMCGrammarParser.PrintIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CMCGrammarParser#outputType}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(CMCGrammarParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CMCGrammarParser#outputType}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(CMCGrammarParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iffStmt}
	 * labeled alternative in {@link CMCGrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIffStmt(CMCGrammarParser.IffStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iffStmt}
	 * labeled alternative in {@link CMCGrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIffStmt(CMCGrammarParser.IffStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmtElse}
	 * labeled alternative in {@link CMCGrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmtElse(CMCGrammarParser.IfStmtElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmtElse}
	 * labeled alternative in {@link CMCGrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmtElse(CMCGrammarParser.IfStmtElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileeStmt}
	 * labeled alternative in {@link CMCGrammarParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileeStmt(CMCGrammarParser.WhileeStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileeStmt}
	 * labeled alternative in {@link CMCGrammarParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileeStmt(CMCGrammarParser.WhileeStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forrStmt}
	 * labeled alternative in {@link CMCGrammarParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void enterForrStmt(CMCGrammarParser.ForrStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forrStmt}
	 * labeled alternative in {@link CMCGrammarParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void exitForrStmt(CMCGrammarParser.ForrStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#callfunction}.
	 * @param ctx the parse tree
	 */
	void enterCallfunction(CMCGrammarParser.CallfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#callfunction}.
	 * @param ctx the parse tree
	 */
	void exitCallfunction(CMCGrammarParser.CallfunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnVal}
	 * labeled alternative in {@link CMCGrammarParser#retrn}.
	 * @param ctx the parse tree
	 */
	void enterReturnVal(CMCGrammarParser.ReturnValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnVal}
	 * labeled alternative in {@link CMCGrammarParser#retrn}.
	 * @param ctx the parse tree
	 */
	void exitReturnVal(CMCGrammarParser.ReturnValContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CMCGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CMCGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#assignOP}.
	 * @param ctx the parse tree
	 */
	void enterAssignOP(CMCGrammarParser.AssignOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#assignOP}.
	 * @param ctx the parse tree
	 */
	void exitAssignOP(CMCGrammarParser.AssignOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link CMCGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPlus(CMCGrammarParser.ExprPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link CMCGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPlus(CMCGrammarParser.ExprPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMinum}
	 * labeled alternative in {@link CMCGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMinum(CMCGrammarParser.ExprMinumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMinum}
	 * labeled alternative in {@link CMCGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMinum(CMCGrammarParser.ExprMinumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprTerm}
	 * labeled alternative in {@link CMCGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTerm(CMCGrammarParser.ExprTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprTerm}
	 * labeled alternative in {@link CMCGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTerm(CMCGrammarParser.ExprTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termDiv}
	 * labeled alternative in {@link CMCGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermDiv(CMCGrammarParser.TermDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termDiv}
	 * labeled alternative in {@link CMCGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermDiv(CMCGrammarParser.TermDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termMod}
	 * labeled alternative in {@link CMCGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermMod(CMCGrammarParser.TermModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termMod}
	 * labeled alternative in {@link CMCGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermMod(CMCGrammarParser.TermModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termFactor}
	 * labeled alternative in {@link CMCGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermFactor(CMCGrammarParser.TermFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termFactor}
	 * labeled alternative in {@link CMCGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermFactor(CMCGrammarParser.TermFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termMult}
	 * labeled alternative in {@link CMCGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermMult(CMCGrammarParser.TermMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termMult}
	 * labeled alternative in {@link CMCGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermMult(CMCGrammarParser.TermMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprParnt}
	 * labeled alternative in {@link CMCGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExprParnt(CMCGrammarParser.ExprParntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprParnt}
	 * labeled alternative in {@link CMCGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExprParnt(CMCGrammarParser.ExprParntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorId}
	 * labeled alternative in {@link CMCGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorId(CMCGrammarParser.FactorIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorId}
	 * labeled alternative in {@link CMCGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorId(CMCGrammarParser.FactorIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorNum}
	 * labeled alternative in {@link CMCGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorNum(CMCGrammarParser.FactorNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorNum}
	 * labeled alternative in {@link CMCGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorNum(CMCGrammarParser.FactorNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorStr}
	 * labeled alternative in {@link CMCGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorStr(CMCGrammarParser.FactorStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorStr}
	 * labeled alternative in {@link CMCGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorStr(CMCGrammarParser.FactorStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueValue}
	 * labeled alternative in {@link CMCGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterTrueValue(CMCGrammarParser.TrueValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueValue}
	 * labeled alternative in {@link CMCGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitTrueValue(CMCGrammarParser.TrueValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseValue}
	 * labeled alternative in {@link CMCGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterFalseValue(CMCGrammarParser.FalseValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseValue}
	 * labeled alternative in {@link CMCGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitFalseValue(CMCGrammarParser.FalseValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpres}
	 * labeled alternative in {@link CMCGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpres(CMCGrammarParser.BoolExpresContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpres}
	 * labeled alternative in {@link CMCGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpres(CMCGrammarParser.BoolExpresContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMCGrammarParser#incr}.
	 * @param ctx the parse tree
	 */
	void enterIncr(CMCGrammarParser.IncrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMCGrammarParser#incr}.
	 * @param ctx the parse tree
	 */
	void exitIncr(CMCGrammarParser.IncrContext ctx);
}