public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo() - valor);
    }
}
