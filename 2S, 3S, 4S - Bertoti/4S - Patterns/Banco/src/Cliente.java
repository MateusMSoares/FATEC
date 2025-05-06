import java.util.ArrayList;
import java.util.List;

public class Cliente implements OrderObserver{
    private String nome;
    private String endereco;
    private List<Carrinho> carrinhos = new ArrayList<>();
    private List<Produto> desejos = new ArrayList<>();
    private String email;


    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public List<Carrinho> getCarrinhos() {
        return carrinhos;
    }

    public String getEndereco() { return endereco; }

    public void setEndereco(String endereco) { this.endereco = endereco; }

  
    public String getEmail() { return this.email; }

    public void setEmail(String email) { this.email = email; }

    public void setCarrinhos(List<Carrinho> carrinhos) {
        this.carrinhos = carrinhos;
    }

    public List<Produto> getDesejos() {
        return desejos;
    }

    public void setDesejos(List<Produto> desejos) {
        this.desejos = desejos;
    }      

    
    public void atualizar(String mensagem){
        System.out.println(email + ": mensagem " + mensagem);
    }
}
