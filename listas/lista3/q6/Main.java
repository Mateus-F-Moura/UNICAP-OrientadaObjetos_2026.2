public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Civic");
        CarroEletrico carroEletrico = new CarroEletrico("Dolphin");

        carro.acelerar();
        carroEletrico.acelerar();

        System.out.println(carro.getModelo() + ": " + carro.getVelocidadeAtual() + " km/h");
        System.out.println(carroEletrico.getModelo() + ": " + carroEletrico.getVelocidadeAtual() + " km/h");
        carroEletrico.carregarBateria();
    }
}
