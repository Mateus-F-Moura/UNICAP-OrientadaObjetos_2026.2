public class Filme {
    private String nome;
    private String genero;
    private Integer anoLancamento;

    public Filme() {
    }
    
    public Filme(String nome, String genero, Integer anoLancamento) {
        this.nome = nome;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Filme [nome=" + nome + ", genero=" + genero + ", anoLancamento=" + anoLancamento + "]";
    }
}