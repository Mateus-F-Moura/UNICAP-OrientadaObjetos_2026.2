import java.util.ArrayList;

public class Empresa {
    private Gerente gerente;
    private ArrayList<Projeto> projetos = new ArrayList<>();
    
    public Empresa(Gerente gerente, ArrayList<Projeto> projetos) {
        this.gerente = gerente;
        this.projetos = projetos;
    }
}