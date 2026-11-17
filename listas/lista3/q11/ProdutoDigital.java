public class ProdutoDigital extends Produto implements Descontavel {
    public ProdutoDigital(String nome, Double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase();
    }

    @Override
    public double aplicarDesconto(double percentual) {
        return calcularPrecoFinal() - (calcularPrecoFinal() * (percentual / 100));
    }
}
