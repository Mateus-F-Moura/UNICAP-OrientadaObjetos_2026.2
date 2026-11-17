public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto(String nome, Double preco, Integer quantidade) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("O número precisa ser maior que zero");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa");
        }

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
