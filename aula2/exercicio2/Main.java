package exercicio2;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(15, 8, 1998);
        Telefone telefone = new Telefone(81, 998765432);
        Endereco endereco = new Endereco("Rua das Flores", 123, "Boa Vista", "Recife", "PE");
        Cliente cliente = new Cliente(
                "Maria da Silva",
                "12.345.678",
                "123.456.789-09",
                telefone,
                data,
                endereco
        );

        System.out.println(cliente);
    }
}
