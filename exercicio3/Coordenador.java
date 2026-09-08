package exercicio3;

public class Coordenador extends Pessoa {
    private String setor;

    public Coordenador(String nome, Integer idade, String setor) {
        super(nome, idade);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void coordenar() {
        System.out.println("Coordenando...");
    }

    @Override
    public String toString() {
        return super.toString() + ", Setor:" + setor;
    }

    
}
