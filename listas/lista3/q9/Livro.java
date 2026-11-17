public class Livro {
    private String titulo;
    private Integer exemplaresDisponiveis;

    public void emprestar() {
        if (exemplaresDisponiveis == 0) {
            throw new LivroIndisponivelException("Livro sem exemplares disponíveis");
        }

        exemplaresDisponiveis -= 1;
    }
}
