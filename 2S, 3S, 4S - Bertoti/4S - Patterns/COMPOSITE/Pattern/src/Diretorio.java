import java.util.ArrayList;
import java.util.List;

public class Diretorio implements Componente {
    private String nomeDiretorio;
    private List<Componente> componentes = new ArrayList<>();

    public Diretorio(String nomeDiretorio) {
        this.nomeDiretorio = nomeDiretorio;
    }

    public void adicionarComponente(Componente componente) {
        componentes.add(componente);
    }

    public void removerComponente(Componente componente) {
        componentes.remove(componente);
    }

    @Override
    public void display(String identacao) {
        System.out.println(identacao + " - Diretorio: " + nomeDiretorio);
        for (Componente componente : componentes) {
            componente.display(identacao + " ");
        }
    }

}
