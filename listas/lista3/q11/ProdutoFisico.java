public class ProdutoFisico extends Produto {
    public ProdutoFisico(String nome, Double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + 15.0;
    }
}
