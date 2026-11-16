package exercicio3;

public class Aluno extends  Pessoa {
    private Double media;

    public Aluno(String nome, Integer idade, Double media) {
        super(nome, idade);
        this.media = media;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public boolean foiAprovado() {
        return media >= 7 ? true : false;
    }

    @Override
    public String toString() {
        return super.toString() + ", Media:" + media;
    }
}
