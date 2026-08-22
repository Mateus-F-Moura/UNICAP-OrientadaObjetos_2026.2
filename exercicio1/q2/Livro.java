package exercicio1.q2;

public class Livro {
    private String titulo;
    private Integer anoPublicacao;
    private Autor autor;
    
    public Livro(String titulo, Integer anoPublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Ano de Publicação: " + anoPublicacao + ", Autor: " + autor;
    }
}
