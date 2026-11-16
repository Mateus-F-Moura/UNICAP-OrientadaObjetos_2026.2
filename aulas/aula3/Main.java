public class Main {
    public static void main(String[] args) {
        Cliente clientePF = new ClientePF("João", "Rua A, 123", "123.456.789-00");
        Cliente clientePJ = new ClientePJ("Empresa XYZ", "Av. B, 456", "12.345.678/0001-99");

        System.out.println(clientePF);
        System.out.println(clientePJ);
    }
}
