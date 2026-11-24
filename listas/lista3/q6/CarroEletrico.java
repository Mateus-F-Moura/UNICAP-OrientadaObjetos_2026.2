public class CarroEletrico extends Veiculo implements Eletrico {
    public CarroEletrico(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        setVelocidadeAtual(getVelocidadeAtual() + 15);
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando a bateria do " + getModelo());
    }
}
