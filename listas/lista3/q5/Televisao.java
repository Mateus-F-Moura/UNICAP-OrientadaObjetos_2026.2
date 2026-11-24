public class Televisao implements Ligavel {
    @Override
    public void ligar() {
        System.out.println("Televisão ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Televisão desligada");
    }
}
