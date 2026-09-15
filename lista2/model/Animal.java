package model;

import java.util.ArrayList;
import java.util.Objects;

public class Animal {
    private final long id;
    private String nome;
    private Integer idade;
    private double peso;
    private ArrayList<String> habilidades = new ArrayList<>();

    public Animal(long id, String nome, Integer idade, double peso) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String emitirSom() {
        return "som desconhecido";
    }

    public String realizarHabilidade(String habilidade) {
        boolean temHabilidade = false;

        for (String habilidades : habilidades) {
            if (Objects.equals(habilidade, habilidades)) {
                temHabilidade = true;
                break;
            }
        }

        return temHabilidade ? nome + " consegue " + habilidade : nome + " não consegue " + habilidade;
    }

    public void addHabilidades(String habilidade) {
        habilidades.add(habilidade);
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Idade: " + idade +
                ", Peso:" + peso;
    }
}
