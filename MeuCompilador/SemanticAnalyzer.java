import java.util.HashMap;

public class SemanticAnalyzer {
    private HashMap<String, String> symbolTable;

    public SemanticAnalyzer() {
        this.symbolTable = new HashMap<String, String>();
    }

    public void analyze(Node node) {
        switch(node.getName()) {
            case "prog":
                for(Node child : node.getChildren()) {
                    analyze(child);
                }
                break;
            case "includes":
                
                break;
            case "globals":
                for(Node child : node.getChildren()) {
                    analyze(child);
                }
                break;
            case "vars":
                String type = node.getChildren().get(0).getValue();
                for(int i = 1; i < node.getChildren().size(); i++) {
                    Node child = node.getChildren().get(i);
                    String identifier = child.getValue();
                    if(symbolTable.containsKey(identifier)) {
                        // Erro: variável já foi declarada
                    } else {
                        symbolTable.put(identifier, type);
                    }
                }
                break;
            case "functions":
                for(Node child : node.getChildren()) {
                    analyze(child);
                }
                break;
            case "function":
                String functionName = node.getChildren().get(1).getValue();
                if(symbolTable.containsKey(functionName)) {
                    // Erro: função já foi declarada
                } else {
                    symbolTable.put(functionName, "function");
                }
                for(int i = 2; i < node.getChildren().size() - 1; i++) {
                    Node child = node.getChildren().get(i);
                    String identifier = child.getValue();
                    if(symbolTable.containsKey(identifier)) {
                        // Erro: variável ou função já foi declarada
                    } else {
                        symbolTable.put(identifier, node.getChildren().get(i-1).getValue());
                    }
                }
                analyze(node.getChildren().get(node.getChildren().size()-1)); // Analisa o bloco da função
                break;
            case "main":
                analyze(node.getChildren().get(1)); // Analisa o bloco do main
                break;
            case "block":
                for(Node child : node.getChildren()) {
                    analyze(child);
                }
                break;
            case "varDeclart":
                String type = node.getChildren().get(0).getValue();
                for(int i = 1; i < node.getChildren().size(); i++) {
                    Node child = node.getChildren().get(i);
                    String identifier = child.getValue();
                    if(symbolTable.containsKey(identifier)) {
                        // Erro: variável já foi declarada
                    } else {
                        symbolTable.put(identifier, type);
                    }
                }
                break;
            case "attrLine":
                String identifier = node.getChildren().get(0).getValue();
                String expressionType = analyze(node.getChildren().get(2));
                String variableType = symbolTable.get(identifier);
                if(!expressionType.equals(variableType)) {
                    // Erro: tipo da expressão não corresponde ao tipo da variável
                }
                break;
            case "inputLine":
                identifier = node.getChildren().get(1).getValue();
                if(!symbolTable.containsKey(identifier)) {
                    // Erro: variável não declarada
                }
                break;
            case "outputLine":
                analyze(node.getChildren().get(1)); // Analisa o tipo de saída
                break;
            case "printSTR":
                break;
            case "printID":
                identifier = node.getChildren().get(0).getValue();
                if(!symbolTable.containsKey(identifier)) {
                    // Erro: variável não declarada
                }
            case "VarDeclartContext":
                String type = tree.getChild(0).getText();
                List<ParseTree> vars = getChildrenByName(tree, "ID");
                for (ParseTree var : vars) {
                    String name = var.getText();
                    if (symbolTable.containsKey(name)) {
                        throw new RuntimeException("Semantic error: variable " + name + " already declared.");
                    }
                    symbolTable.put(name, new Symbol(type, null));
                }
                break;
            case "AttrExprContext":
                String varName = tree.getChild(0).getText();
                Symbol varSymbol = symbolTable.get(varName);
                if (varSymbol == null) {
                    throw new RuntimeException("Semantic error: variable " + varName + " not declared.");
                }
                String varType = varSymbol.getType();
                String exprType = getExprType(tree.getChild(2));
                if (!varType.equals(exprType)) {
                    throw new RuntimeException("Semantic error: incompatible types in assignment to variable " + varName + ".");
                }
                break;
            default:
                for (int i = 0; i < tree.getChildCount(); i++) {
                    semanticAnalysis(tree.getChild(i));
                }
        }
} 