import model.Animal;
import model.Cachorro;
import model.Gato;
import model.Passaro;
import model.Zoologico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Zoologico zoologico = new Zoologico();

        boolean loop = true;
        do {
            System.out.println();
            System.out.println("1. Adicionar animal");
            System.out.println("2. Listar todos os animais");
            System.out.println("3. Remover animal");
            System.out.println("4. Emitir som de um animal");
            System.out.println("5. Testar habilidade de um animal");
            System.out.println("0. Sair");
            System.out.println();

            System.out.print("Opção: ");
            int option = sc.nextInt();
            System.out.println();

            switch (option) {
                case 1 -> {
                    System.out.println("1. Gato");
                    System.out.println("2. Cachorro");
                    System.out.println("3. Passáro");
                    System.out.println();

                    System.out.print("Opção: ");
                    int animalOption = sc.nextInt();

                    System.out.print("Id: ");
                    long id = sc.nextLong();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade: ");
                    int idade = sc.nextInt();

                    System.out.print("Peso: ");
                    double peso = sc.nextDouble();

                    switch (animalOption) {
                        case 1 -> {
                            Animal gato = new Gato(id, nome, idade, peso);
                            zoologico.addAnimal(gato);
                        }
                        case 2 -> {
                            Animal cachorro = new Cachorro(id, nome, idade, peso);
                            zoologico.addAnimal(cachorro);
                        }
                        case 3 -> {
                            Animal passaro = new Passaro(id, nome, idade, peso);
                            zoologico.addAnimal(passaro);
                        }
                    }
                }
                case 2 -> {
                    for (Animal animal : zoologico.listAnimais()) {
                        System.out.println(animal.getNome());
                    }
                }
                case 3 -> {
                    System.out.print("Id a ser removido: ");
                    long id = sc.nextLong();
                    zoologico.removeAnimal(id);
                }
                case 4 -> {
                    System.out.print("Id do animal: ");
                    long id = sc.nextLong();

                    Animal animal = zoologico.searchAnimal(id);

                    if (animal != null) {
                        System.out.println(animal.getNome() + " diz " + animal.emitirSom());
                    }
                }
                case 5 -> {
                    System.out.print("Id do animal: ");
                    long id = sc.nextLong();
                    sc.nextLine();

                    System.out.print("Habilidade: ");
                    String habilidade = sc.nextLine();
                    Animal animal = zoologico.searchAnimal(id);

                    if (animal != null) {
                        System.out.println(animal.realizarHabilidade(habilidade));
                    }
                }
                case 0 -> loop = false;
                default -> System.out.println("Opção inválida");
            }
        } while (loop);
    }
}