public class FuncionarioCLT extends Funcionario {
    public FuncionarioCLT (String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase()  + (super.salarioBase() * (10.0 / 100));
    }
}