package edu.fatec.lp2.exercicio2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Produto {

    private String nome;
    private String unidade;
    private String descricao;
    private Double preco;
    private Double DescontoMaximo;
    private Supermercado supermercado;

    public Produto(Supermercado s){
        this.supermercado = s;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", unidade=" + unidade + ", descricao=" + descricao + ", preco=" + preco
                + ", DescontoMaximo=" + DescontoMaximo + ", supermercado=" + supermercado + "]";
    }

    
}
