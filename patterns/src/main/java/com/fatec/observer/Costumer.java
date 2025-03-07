package com.fatec.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Costumer implements Observer {
    private Long id;
    private String name;

    public Costumer(String name) {
        this.name = name;
    }

    @Override
    public void update(Product product, Integer quantity) {
        System.out.println("Cliente " + name + " foi notificado: Produto " 
            + product.getNome() + " agora tem " + quantity + " unidades em estoque.");
    }

}
