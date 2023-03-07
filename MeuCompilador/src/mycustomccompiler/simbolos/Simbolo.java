
package mycustomccompiler.simbolos;

public class Simbolo {

    private Integer id;
    private String val;
    private String tipo;
    private String nome;

    public Simbolo() {
        this.id = 0;
        this.tipo = "";
        this.val = "";
        this.nome = "";
    }

    public Simbolo(Integer id, String tipo, String nome, String val) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.val = val;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
