public class Main {
    public static void main(String[] args) {
        Filme[] filmes = new Filme[3];

        filmes[0] = new Filme("Shawhawk Redemption", "Drama", 1994);
        filmes[1] = new Filme("Cidade de Deus", "Nacional", 2002);

        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }
}