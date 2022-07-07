package dio.andrew.projeto;

public class Livro {
    private String nome;
    private int numPg;

    public Livro(String nome, int numPg) {
        this.nome = nome;
        this.numPg = numPg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPg() {
        return numPg;
    }

    public void setNumPg(int numPg) {
        this.numPg = numPg;
    }
}
