public abstract class Veiculo {
    private String modelo;
    private int velocidadeAtual;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    protected void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public abstract void acelerar();
}
