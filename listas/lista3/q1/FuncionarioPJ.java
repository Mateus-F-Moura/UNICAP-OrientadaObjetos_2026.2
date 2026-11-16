public class FuncionarioPJ extends Funcionario {
    public FuncionarioCLT (String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase()  + (super.salarioBase() * (5.0 / 100));
    }
}