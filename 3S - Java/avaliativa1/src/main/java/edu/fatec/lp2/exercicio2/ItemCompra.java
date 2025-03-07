package edu.fatec.lp2.exercicio2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ItemCompra implements Calculavel{
    private int quantidade;
    private Produto produto;
    private Double desconto;

    public ItemCompra(Produto produto, Double desconto) {
        this.produto = produto;
        this.desconto = desconto;
    }

    public Double calcularPreco() {
        return (produto.getPreco() - desconto) * quantidade;
    }
}
