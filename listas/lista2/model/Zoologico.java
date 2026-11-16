package model;

import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animais = new ArrayList<>();

    public Zoologico() {
    }

    public boolean addAnimal(Animal animal) {
        return searchAnimal(animal.getId()) == null ? animais.add(animal) : false;
    }

    public boolean removeAnimal(long id) {
        boolean removed = false;

        for (Animal animal : animais) {
            if (id == animal.getId()) {
                animais.remove(animal);
                removed = true;
            }
        }

        return removed;
    }

    public ArrayList<Animal> listAnimais() {
        return animais;
    }

    public Animal searchAnimal(long id) {
        for (Animal animal : animais) {
            if (id == animal.getId()) {
                return animal;
            }
        }

        return null;
    }
}
