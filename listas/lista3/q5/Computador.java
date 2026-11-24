public class Computador implements Ligavel, Conectavel {
    @Override
    public void ligar() {
        System.out.println("Computador ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligado");
    }

    @Override
    public void conectarInternet() {
        System.out.println("Computador conectado à internet");
    }
}
