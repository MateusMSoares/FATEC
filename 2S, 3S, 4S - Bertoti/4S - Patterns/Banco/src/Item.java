public class Item implements Produto{
    private String nome;
    private Double price;

    public Item(String nome, Double price){
        this.nome = nome;
        this.price = price;
    }

    public Double getPrice() { return price; }
    public String getNome() { return nome; }
}
