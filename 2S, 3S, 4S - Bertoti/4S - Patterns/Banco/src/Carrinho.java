import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private Double totalProdutos;
    private Double frete;
    private Double totalComFrete;
    private List<Produto> produtos = new ArrayList<>();

    public Double getTotalProdutos() {
        return totalProdutos;
    }

    public void setTotalProdutos() {
        Double total = null;
        if (!produtos.isEmpty()) {
            total = produtos.get(0).getPrice();
        }
        this.totalProdutos = total;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(String endereco) {
        Double resultado = 0.0 + 5.50;
        System.out.println("Logica de frete para: "+endereco );

        if (endereco.contains("M")) {
            this.frete = null;
            return;
        }
        
        this.frete = resultado;
    }

    public Double getTotalComFrete() {
        return totalComFrete;
    }

    public void setTotalComFrete(Double total, Double frete) {
        if (total > 0.0 && frete >= 0.0) {
            this.totalComFrete =  total + frete;
            return;
        }
        
        this.totalComFrete = getTotalProdutos() + getFrete();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }


}
