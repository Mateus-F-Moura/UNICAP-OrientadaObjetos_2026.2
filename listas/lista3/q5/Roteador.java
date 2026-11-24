public class Roteador implements Ligavel, Conectavel {
    @Override
    public void ligar() {
        System.out.println("Roteador ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Roteador desligado");
    }

    @Override
    public void conectarInternet() {
        System.out.println("Roteador conectado à internet");
    }
}
