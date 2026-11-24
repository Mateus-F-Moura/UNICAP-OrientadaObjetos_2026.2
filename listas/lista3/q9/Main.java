public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", 2);

        for (int i = 0; i < 3; i++) {
            try {
                livro.emprestar();
                System.out.println("Empréstimo realizado: " + livro.getTitulo());
            } catch (LivroIndisponivelException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
