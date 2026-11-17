public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + 2.0);
    }
}
