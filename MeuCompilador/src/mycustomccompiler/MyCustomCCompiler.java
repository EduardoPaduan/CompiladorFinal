
package mycustomccompiler;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import MCGrammar.CMCGrammarLexer;
import MCGrammar.CMCGrammarParser;
import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import mycustomccompiler.simbolos.TabelaSimbolos;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class MyCustomCCompiler {


    public static void main(String[] args) throws Exception {
        CharStream input = new ANTLRFileStream("teste.mc3");
        CMCGrammarLexer lexer = new CMCGrammarLexer(input);
        TokenStream tokens = new BufferedTokenStream(lexer);
        CMCGrammarParser parser = new CMCGrammarParser(tokens);
        CMCGrammarParser.ProgContext lang = parser.prog();

        TabelaSimbolos symbolTable = TabelaSimbolos.getInstance();

        Visitor visitor = new Visitor();
        visitor.visit(lang);

        showParseTreeFrame(lang, parser); //lang

        for (int i = 0; i < symbolTable.size(); i++) {
            System.out.println(
                    "ID: " + symbolTable.get(i).getId()
                    + " Tipo: " + symbolTable.get(i).getTipo()
                    + " Nome: " + symbolTable.get(i).getNome()
                    + " Valor: " + symbolTable.get(i).getVal()
            );
        }
    }

    private static void showParseTreeFrame(ParseTree tree, CMCGrammarParser parser) throws HeadlessException {
        JFrame frame = new JFrame("SRC: " + tree.getText());
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewr.setScale(1);
        panel.add(viewr);
        frame.add(panel);
        frame.setSize(1000, 600);
        frame.setState(JFrame.MAXIMIZED_HORIZ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
