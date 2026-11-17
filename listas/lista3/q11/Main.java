public class Main {
    public static void main(String[] args) {
        try {
            Produto produto1 = new ProdutoFisico("Teclado", 100.0);
            Produto produto2 = new ProdutoFisico("Mouse", 80.0);
            ProdutoDigital produto3 = new ProdutoDigital("Curso Java", 200.0);
            ProdutoDigital produto4 = new ProdutoDigital("E-book", 50.0);

            Produto[] produtos = {produto1, produto2, produto3, produto4};

            System.out.println("Produtos cadastrados:");

            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Preço final: R$ " + produto.calcularPrecoFinal());
                System.out.println();
            }

            double precoComDesconto = produto3.aplicarDesconto(10);

            System.out.println("Aplicando desconto em produto digital:");
            System.out.println("Produto: " + produto3.getNome());
            System.out.println("Preço com desconto de 10%: R$ " + precoComDesconto);

            System.out.println();

            Produto produtoInvalido = new ProdutoFisico("Produto inválido", 0.0);

        } catch (PrecoInvalidoException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
