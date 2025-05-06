import java.util.ArrayList;
import java.util.List;

public class Grupoitens implements Produto {
    private String nome;
    private List<Produto> produtos = new ArrayList<>();
    private Double total;

    public Grupoitens(String nome) {
        this.nome = nome;
    }

    public void addProduct(Produto product) {
        produtos.add(product);
        total += product.getPrice();
    }

    public Double getPrice() {
        return total;
    }

    public String getNome() { return nome; }

    
}
