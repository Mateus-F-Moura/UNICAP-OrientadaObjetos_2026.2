public class Projeto {
    private String nome;
    private String descricao;
    private Desenvolvedor desenvolvedorResposavel;

    public Projeto (String nome, String descricao, Desenvolvedor desenvolvedorResponsavel){
        this.nome = nome;
        this.descricao = descricao;
        this.desenvolvedorResposavel = desenvolvedorResponsavel;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public Desenvolvedor getDesenvolvedorResponsavel(){
        return desenvolvedorResposavel;
    }
    public void setDesenvolvedorResponsavel(Desenvolvedor desenvolvedorResposavel){
        this.desenvolvedorResposavel = desenvolvedorResposavel;
    }

}