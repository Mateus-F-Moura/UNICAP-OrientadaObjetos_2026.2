package exercicio1.q2;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Fiódor Dostoiévski", "Russia");
        Livro livro = new Livro("Noites Brancas", 1848, autor);

        System.out.println(livro);
    }
}
