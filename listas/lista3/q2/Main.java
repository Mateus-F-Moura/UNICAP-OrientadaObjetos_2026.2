public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[3];

        formas[0] = new Circulo(5.0);
        formas[1] = new Retangulo(4.0, 6.0);
        formas[2] = new Triangulo(4.0, 6.0);

        for (FormaGeometrica forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}