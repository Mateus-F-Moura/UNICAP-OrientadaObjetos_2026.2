package exercicio2;

public class Cliente {
    private String nome;
    private String rg;
    private String cpf;
    private Telefone telefone;
    private Data data;
    private Endereco endereco;

    public Cliente(String nome, String rg, String cpf, Telefone telefone, Data data, Endereco endereco) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data = data;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return """
                Cliente: 
                nome=%s, 
                rg=%s, 
                cpf=%s, 
                telefone=%s, 
                data=%s, 
                endereco=%s
                """ .formatted(nome, rg, cpf, telefone, data, endereco);
    }

    
}
