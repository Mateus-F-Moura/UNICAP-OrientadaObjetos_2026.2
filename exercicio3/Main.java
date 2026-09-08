package exercicio3;

public class Main {
	public static void main(String[] args) {
		Turma turma = new Turma();

		Aluno alunoAprovado = new Aluno("Mateus", 20, 8.5);
		Aluno alunoReprovado = new Aluno("Silas", 19, 5.0);
		Aluno alunoComMedia = new Aluno("Cayo", 21, 7.0);

		Professor professorPOO = new Professor("Daniel",  40, "Orientação a Objetos");
		Professor professorPI = new Professor("Gabriel", 38, "Projeto Integrador");
		Coordenador coordenador = new Coordenador("Marcio", 45, "Coordenação de T.I");

		turma.adicionarPessoas(alunoAprovado);
		turma.adicionarPessoas(alunoReprovado);
		turma.adicionarPessoas(alunoComMedia);
		turma.adicionarPessoas(professorPOO);
		turma.adicionarPessoas(professorPI);
		turma.adicionarPessoas(coordenador);

		turma.analisarPessoas();
	}
}
