public class Livro {
    private String titulo;
    private Integer exemplaresDisponiveis;

    public Livro(String titulo, Integer exemplaresDisponiveis) {
        this.titulo = titulo;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void emprestar() {
        if (exemplaresDisponiveis == 0) {
            throw new LivroIndisponivelException("Livro sem exemplares disponíveis");
        }

        exemplaresDisponiveis -= 1;
    }
}
