package exercicio1.q2;

public class Autor {
    private String nome;
    private String nacionalidade;
    public Autor(String name, String nacionalidade) {
        this.nome = name;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "[" + "Nome: " + nome + ", Nacionalidade: " + nacionalidade + "]";
    }
}
