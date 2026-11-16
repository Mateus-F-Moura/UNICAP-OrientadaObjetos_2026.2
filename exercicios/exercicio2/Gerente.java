public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, String cpf, Double salario, String departamento) {
        super(nome, cpf, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
