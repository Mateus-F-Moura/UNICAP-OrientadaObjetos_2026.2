public class Divisao {
    public Double divisao(double x, double y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Erro! Não é possível dividir por zero: " + e);
        } finally {
            System.out.println("Operação encerrada");
        }
    }
}
