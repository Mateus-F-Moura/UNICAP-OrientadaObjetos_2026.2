public class Carro extends Veiculo {
    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        setVelocidadeAtual(getVelocidadeAtual() + 10);
    }
}
