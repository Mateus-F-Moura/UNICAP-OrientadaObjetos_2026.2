public class Main {
    public static void main(String[] args) {
        Conta origem = new Conta(1, 500.0);
        Conta destino = new Conta(2, 100.0);

        transferir(origem, destino, 150.0);
        transferir(origem, destino, 400.0);
        transferir(origem, destino, 0.0);
        transferir(origem, null, 50.0);

        System.out.println("Saldo da origem: R$ " + origem.getSaldo());
        System.out.println("Saldo do destino: R$ " + destino.getSaldo());
    }

    private static void transferir(Conta origem, Conta destino, double valor) {
        try {
            origem.transferir(destino, valor);
            System.out.println("Transferência realizada: R$ " + valor);
        } catch (SaldoInsuficienteException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
