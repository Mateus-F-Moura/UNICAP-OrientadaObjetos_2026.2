public abstract class Produto {
    private String nome;
    private Double precoBase;

    public Produto(String nome, Double precoBase) {
        if (precoBase <= 0) {
            throw new PrecoInvalidoException("Erro: produto não pode ser zero ou menos");
        }

        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(Double precoBase) {
        this.precoBase = precoBase;
    }

    public abstract double calcularPrecoFinal();
}
