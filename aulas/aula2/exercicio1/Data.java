package exercicio1;
public class Data {
    private Integer dia;
    private Integer mes;
    private Integer ano;
    private Hora hora;

    Data(Integer dia, Integer mes, Integer ano, Hora hora) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Data: dia = " + 
        dia + ", mes = " + 
        mes + ", ano = " + 
        ano + ", hora = " + 
        hora + ".";
    }
    
}
