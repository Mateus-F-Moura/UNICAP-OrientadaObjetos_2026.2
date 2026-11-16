package exercicio3;

public class Professor extends Pessoa{
    private String disciplina;

    public Professor(String nome, Integer idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void lecionar() {
        System.out.println("Lecionando...");
    }

    @Override
    public String toString() {
        return super.toString() + ", Disciplina:" + disciplina;
    }

    
}
