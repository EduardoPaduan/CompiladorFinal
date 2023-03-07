
package mycustomccompiler;

import MCGrammar.CMCGrammarBaseVisitor;
import MCGrammar.CMCGrammarParser;
import java.util.Scanner;
import mycustomccompiler.simbolos.*;
import org.antlr.v4.runtime.ParserRuleContext;


public class Visitor extends CMCGrammarBaseVisitor {

    @Override
    public Object visitVars(CMCGrammarParser.VarsContext ctx) {
        String tipo = ctx.type().getText();
        for (int i = 0; i < ctx.ID().size(); i++) {
            String name = (!ctx.ID().isEmpty()) ? ctx.ID().get(i).getText() : "falha";
            Simbolo s = new Simbolo((TabelaSimbolos.getInstance().size() + 1), name, tipo, "null");
            TabelaSimbolos.getInstance().add(s);
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitForrStmt(CMCGrammarParser.ForrStmtContext ctx) {
        String name = ctx.attribution().getText();
        String novoValor = ctx.attribution().getText();
        Simbolo e = null;
        int aux2 = name.length();
        int aux = name.indexOf("=");
        name = name.substring(0, aux);
        novoValor = novoValor.substring(aux + 1, aux2);
        Double n = 0.0;
        int j = 0;

        for (int i = 0; i < TabelaSimbolos.getInstance().size(); i++) {
            if (TabelaSimbolos.getInstance().get(i).getNome().equals(name)) {
                if ((TabelaSimbolos.getInstance().get(i).getTipo().equals("int") || TabelaSimbolos.getInstance().get(i).getTipo().equals("float"))) {
                    e = TabelaSimbolos.getInstance().get(i);
                    e.setVal(novoValor);
                    TabelaSimbolos.getInstance().set(j, e);
                    j = i;
                    n = Double.parseDouble(e.getVal());
                    break;
                }
            }
        }

        Boolean cond = (Boolean) visit(ctx.boolExpr());
        while (cond) {

            if (ctx.incr().getText().equals("+=")) {
                n += Double.parseDouble(ctx.NUM().getText());
            } else if (ctx.incr().getText().equals("-=")) {
                n -= Double.parseDouble(ctx.NUM().getText());
            }
            e.setVal(n.toString());
            TabelaSimbolos.getInstance().set(j, e);
            cond = (Boolean) visit(ctx.boolExpr());
            visit(ctx.block());

        }

        return null;
    }

    @Override
    public Object visitInput(CMCGrammarParser.InputContext ctx) {
        Double oi = 0.0;
        String fl = "";
        Scanner s = new Scanner(System.in);
        String value = s.nextLine();

        for (int i = 0; i < TabelaSimbolos.getInstance().size(); i++) {
            String name = TabelaSimbolos.getInstance().get(i).getNome();
            if (ctx.ID().getText().equals(name)) {
                if (value.length() == 1) {
                    Simbolo e = TabelaSimbolos.getInstance().get(i);
                    e.setVal(value);
                    break;
                } else if (value.matches("[+¬]?[0-9]+(\\.[0-9]+)?") && (TabelaSimbolos.getInstance().get(i).getTipo().equals("int") || TabelaSimbolos.getInstance().get(i).getTipo().equals("float"))) {
                    Simbolo e = TabelaSimbolos.getInstance().get(i);
                    e.setVal(value);
                    break;
                } else if (value.matches("(~[\"\\\\\\r\\n])*") && TabelaSimbolos.getInstance().get(i).getTipo().equals("string")) {
                    Simbolo e = TabelaSimbolos.getInstance().get(i);
                    e.setVal(value);
                    break;
                }

            }
        }
        return null;
    }

    @Override
    public Object visitAttrExpr(CMCGrammarParser.AttrExprContext ctx
    ) {

        Double aux = (Double) visit(ctx.expr());
        int aux1 = 0;
        Integer aux2 = 0;
        String valor = null;

        for (int i = 0; i < TabelaSimbolos.getInstance().size(); i++) {
            String name = TabelaSimbolos.getInstance().get(i).getNome();
            if (ctx.ID().getText().equals(name)) {
                Simbolo e = TabelaSimbolos.getInstance().get(i);
                if (TabelaSimbolos.getInstance().get(i).getTipo().equals("int")) {
                    aux1 = aux.intValue();
                    aux2 = aux1;
                    valor = aux2.toString();
                } else if (TabelaSimbolos.getInstance().get(i).getTipo().equals("float")) {
                    valor = aux.toString();
                }

                e.setVal(valor);
                TabelaSimbolos.getInstance().set(i, e);
                break;
            }
        }
        return null;
    }

    @Override
    public Object visitPrintID(CMCGrammarParser.PrintIDContext ctx
    ) {

        for (int i = 0; i < TabelaSimbolos.getInstance().size(); i++) {
            String name = TabelaSimbolos.getInstance().get(i).getNome();
            if (ctx.ID().getText().equals(name)) {
                Simbolo e = TabelaSimbolos.getInstance().get(i);
                System.out.println(e.getVal());
                break;
            }
        }
        return null;
    }

   
    @Override
    public Object visitIffStmt(CMCGrammarParser.IffStmtContext ctx) {
        Boolean condicao = (Boolean) visit(ctx.boolExpr());

        if (condicao) {
            return visitChildren(ctx);
        } else {
            return null;
        }
    }

    @Override
    public Object visitIfStmtElse(CMCGrammarParser.IfStmtElseContext ctx) {
        Boolean condicao = (Boolean) visit(ctx.boolExpr());

        if (condicao) {
            return visitChildren(ctx.block(0));
        } else {
            return visitChildren(ctx.block(1));
        }
    }
     
    @Override
    public Object visitPrintSTR(CMCGrammarParser.PrintSTRContext ctx
    ) {
        String aux = ctx.STR().getText();
        aux = aux.replace("\"", "");
        System.out.println(aux);

        return null;
    }

    @Override
    public Object visitPrintExpr(CMCGrammarParser.PrintExprContext ctx
    ) {
        Double aux = (Double) visit(ctx.expr());
        System.out.println(aux);

        return null;
    }

    @Override
    public Object visitAttrStr(CMCGrammarParser.AttrStrContext ctx
    ) {
        String aux = ctx.STR().getText();
        aux = aux.replace("\"", "");
        for (int i = 0; i < TabelaSimbolos.getInstance().size(); i++) {
            String name = TabelaSimbolos.getInstance().get(i).getNome();
            if (ctx.ID().getText().equals(name)) {
                if (TabelaSimbolos.getInstance().get(i).getTipo().equals("string")) {
                    Simbolo e = TabelaSimbolos.getInstance().get(i);
                    e.setVal(aux);
                    TabelaSimbolos.getInstance().set(i, e);
                    break;
                }
            }
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitReturnVal(CMCGrammarParser.ReturnValContext ctx
    ) {
        System.out.println("return 0");
        System.exit(0);
        return null;
    }

    @Override
    public Object visitExprPlus(CMCGrammarParser.ExprPlusContext ctx
    ) {
        Double a = (Double) visit(ctx.term());
        Double b = (Double) visit(ctx.expr());
        return a + b;
    }

    @Override
    public Object visitExprMinum(CMCGrammarParser.ExprMinumContext ctx
    ) {
        Double a = (Double) visit(ctx.term());
        Double b = (Double) visit(ctx.expr());
        return a - b;
    }

    @Override
    public Object visitTermDiv(CMCGrammarParser.TermDivContext ctx
    ) {
        Double a = (Double) visit(ctx.term());
        Double b = (Double) visit(ctx.factor());
        return a / b;
    }

    @Override
    public Object visitTermMult(CMCGrammarParser.TermMultContext ctx
    ) {
        Double a = (Double) visit(ctx.term());
        Double b = (Double) visit(ctx.factor());
        return a * b;
    }

    @Override
    public Object visitTermMod(CMCGrammarParser.TermModContext ctx
    ) {
        Double a = (Double) visit(ctx.term());
        Double b = (Double) visit(ctx.factor());
        return a % b;
    }

    @Override
    public Object visitFactorId(CMCGrammarParser.FactorIdContext ctx
    ) {
        Object aux = null;
        String nome;
        String tipo;
        String val;

        for (int i = 0; i < TabelaSimbolos.getInstance().size(); i++) {
            nome = TabelaSimbolos.getInstance().get(i).getNome();
            tipo = TabelaSimbolos.getInstance().get(i).getTipo();
            val = TabelaSimbolos.getInstance().get(i).getVal();

            if (ctx.ID().getText().equals(nome) && !tipo.equals("string")) {
                aux = Double.parseDouble(val);
                return aux;
            }
        }
        return null;
    }

    @Override
    public Object visitFactorNum(CMCGrammarParser.FactorNumContext ctx
    ) {
        return Double.parseDouble(ctx.NUM().getText());
    }

    @Override
    public Object visitExprParnt(CMCGrammarParser.ExprParntContext ctx
    ) {
        Double a = (Double) visit(ctx.expr());
        return a;
    }

    @Override
    public Object visitBoolExpres(CMCGrammarParser.BoolExpresContext ctx) {
        Double a = (Double) visit(ctx.factor(0));
        Double b = (Double) visit(ctx.factor(1));

        String aux = ctx.assignOP().getText();
        if (aux.equals("==")) {
            return a.equals(b);
        } else if (aux.equals("<")) {
            return a < b;
        } else if (aux.equals(">")) {
            return a > b;
        } else if (aux.equals("<=")) {
            return a <= b;
        } else if (aux.equals(">=")) {
            return a >= b;
        } else if (aux.equals("!=")) {
            return !a.equals(b);
        }
        return null;
    }

    @Override
    public Object visitFalseValue(CMCGrammarParser.FalseValueContext ctx
    ) {
        return false;
    }

    @Override
    public Object visitTrueValue(CMCGrammarParser.TrueValueContext ctx
    ) {
        return true;
    }
}
