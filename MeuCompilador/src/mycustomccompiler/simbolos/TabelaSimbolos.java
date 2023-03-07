
package mycustomccompiler.simbolos;

import java.util.ArrayList;
import java.util.function.Consumer;

public class TabelaSimbolos {

    private static TabelaSimbolos uniqueInstance;
    private ArrayList<Simbolo> simbolos;

    public TabelaSimbolos() {
        this.simbolos = new ArrayList<Simbolo>();
    }

    public int size() {
        return simbolos.size();
    }

    public int indexOf(Object o) {
        return simbolos.indexOf(o);
    }

    public Simbolo get(int i) {
        return simbolos.get(i);
    }

    public Simbolo set(int i, Simbolo s) {
        return simbolos.set(i, s);
    }

    public boolean add(Simbolo s) {
        return simbolos.add(s);
    }

    public void clear() {
        simbolos.clear();
    }

    public void forEach(Consumer<? super Simbolo> cnsmr) {
        simbolos.forEach(cnsmr);
    }

    public static synchronized TabelaSimbolos getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new TabelaSimbolos();
        }

        return uniqueInstance;
    }

}
