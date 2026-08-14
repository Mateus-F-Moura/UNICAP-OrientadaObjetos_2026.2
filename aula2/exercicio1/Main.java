package exercicio1;
public class Main {
    public static void main(String[] args) {
        Hora hora = new Hora(10, 20, 30);
        Data data = new Data(30, 12, 2006, hora);

        System.out.println(data);
    }
}