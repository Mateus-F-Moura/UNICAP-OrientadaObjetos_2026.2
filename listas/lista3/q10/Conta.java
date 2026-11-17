public class Conta {
    private Integer numero;
    private Double saldo;

    public Conta(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void transferir(Conta destino, double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Erro: valor não pode ser zero");
        }
        if (destino == null) {
            throw new IllegalArgumentException("Erro: conta inexistente");
        }
        if (saldo < valor) {
            throw new SaldoInsuficienteException("Erro: saldo insuficiente");
        }

        saldo -= valor;
        destino.setSaldo(destino.getSaldo() + valor);
    }
}
