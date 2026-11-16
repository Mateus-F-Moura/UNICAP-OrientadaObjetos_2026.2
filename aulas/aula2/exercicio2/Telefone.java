package exercicio2;

public class Telefone {

    private Integer ddd;
    private Integer numeroBase;

    public Telefone(Integer ddd, Integer numeroBase) {
        this.ddd = ddd;
        this.numeroBase = numeroBase;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Integer getNumeroBase() {
        return numeroBase;
    }

    public void setNumeroBase(Integer numeroBase) {
        this.numeroBase = numeroBase;
    }

    @Override
    public String toString() {
        return """
                Telefone: 
                ddd=%s,
                numeroBase=%s
                """ .formatted(ddd, numeroBase);
    }

}