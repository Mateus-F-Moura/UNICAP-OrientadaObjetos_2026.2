public class Filme {
    private String nome;
    private String nacionalidade;

    public Filme(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Nacionalidade: " + nacionalidade;
    }
}