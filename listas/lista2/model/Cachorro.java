package model;

public class Cachorro extends Animal {
    public Cachorro(long id, String nome, Integer idade, double peso) {
        super(id, nome, idade, peso);
        addHabilidades("farejar");
    }

    @Override
    public String emitirSom() {
        return "au";
    }
}
