package aula1;
public class Circulo {
    private final double PI = Math.PI;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double area() {
        return PI * raio;
    }

    public double comprimento() {
        return 2 * PI * raio;
    }
}