public class Main {
    public static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaCorrente("Fulano", 1000.0);
        ContaBancaria contaPoupanca = new ContaPoupanca("Ciclano", 1000.0);

        System.out.println("Antes das operações:");
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

        contaCorrente.depositar(500.0);
        contaPoupanca.depositar(500.0);

        contaCorrente.sacar(100.0);
        contaPoupanca.sacar(100.0);

        System.out.println();

        System.out.println("Depois das operações:");
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
    }
}