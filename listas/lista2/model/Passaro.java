package model;

public class Passaro extends Animal {
    public Passaro(long id, String nome, Integer idade, double peso) {
        super(id, nome, idade, peso);
        addHabilidades("voar");
    }

    @Override
    public String emitirSom() {
        return "piu";
    }
}
