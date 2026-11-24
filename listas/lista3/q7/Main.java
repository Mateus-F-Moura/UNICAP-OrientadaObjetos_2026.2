import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro inteiro: ");
            int x = scanner.nextInt();
            System.out.print("Digite o segundo inteiro: ");
            int y = scanner.nextInt();

            Divisao divisao = new Divisao();
            System.out.println("Resultado: " + divisao.divisao(x, y));
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero");
        } catch (InputMismatchException e) {
            System.out.println("Digite apenas números inteiros");
        } finally {
            System.out.println("Operação encerrada");
        }
    }
}
