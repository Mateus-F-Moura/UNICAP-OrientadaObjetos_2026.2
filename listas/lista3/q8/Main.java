public class Main {
    public static void main(String[] args) {
        cadastrar("Teclado", 100.0, 2);
        cadastrar("", 80.0, 1);
        cadastrar("Mouse", 0.0, 3);
        cadastrar("Monitor", 500.0, -1);
    }

    private static void cadastrar(String nome, double preco, int quantidade) {
        try {
            new Produto(nome, preco, quantidade);
            System.out.println("Produto cadastrado: " + nome);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
