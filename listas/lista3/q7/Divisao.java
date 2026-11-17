public class Divisao {
    public Double divisao(double x, double y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println("Erro! Não é possível dividir por zero: " + e);
            return 0.0;
        } finally {
            System.out.println("Operação encerrada");
        }
    }
}
