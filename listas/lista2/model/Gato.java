package model;

public class Gato extends Animal {
    public Gato(long id, String nome, Integer idade, double peso) {
        super(id, nome, idade, peso);
        addHabilidades("agilidade");
    }

    @Override
    public String emitirSom() {
        return "miau";
    }
}
