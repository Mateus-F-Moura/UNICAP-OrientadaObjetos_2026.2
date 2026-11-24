public class FuncionarioPJ extends Funcionario {
    public FuncionarioPJ (String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() - (super.getSalarioBase() * (5.0 / 100));
    }
}
