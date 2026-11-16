package exercicio3;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public Turma() {
    }

    public void adicionarPessoas(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void analisarPessoas() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Aluno) {
                Aluno aluno = (Aluno) pessoa;
                System.out.println(aluno);
                System.out.println("Foi aprovado: " + aluno.foiAprovado());
            }
            if (pessoa instanceof Professor) {
                Professor professor = (Professor) pessoa;
                System.out.println(professor);
                professor.lecionar();
            }
            if (pessoa instanceof Coordenador) {
                Coordenador coordenador = (Coordenador) pessoa;
                System.out.println(coordenador);
                coordenador.coordenar();
            }
        }
    }
}
