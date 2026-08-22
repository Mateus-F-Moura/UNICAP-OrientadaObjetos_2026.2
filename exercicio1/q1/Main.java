public class Main {
    public static void main(String[] args) {
        Filme[] filmes = new Filme[3];

        filmes[0] = new Filme("Shawhawk Redemption", "Estados Unidos");
        filmes[1] = new Filme("Cidade de Deus", "Brasil");
        filmes[2] = new Filme("300", "Estados Unidos");

        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }
}