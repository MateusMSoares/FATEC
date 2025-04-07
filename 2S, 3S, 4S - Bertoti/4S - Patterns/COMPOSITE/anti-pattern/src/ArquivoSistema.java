import java.util.ArrayList;
import java.util.List;

public class ArquivoSistema {
     String name;
    List<ArquivoSistema> children;

    public ArquivoSistema(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(ArquivoSistema component) {
        children.add(component);
    }

    public void display(String indent) {
        if (children.isEmpty()) {
            System.out.println(indent + "- Arquivo: " + name);
        } else {
            System.out.println(indent + "+ Pasta: " + name);
            for (ArquivoSistema child : children) {
                child.display(indent + "  ");
            }
        }
    }
}
