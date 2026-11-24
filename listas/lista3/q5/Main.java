public class Main {
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        Roteador roteador = new Roteador();
        Computador computador = new Computador();

        televisao.ligar();
        televisao.desligar();

        roteador.ligar();
        roteador.conectarInternet();
        roteador.desligar();

        computador.ligar();
        computador.conectarInternet();
        computador.desligar();
    }
}
