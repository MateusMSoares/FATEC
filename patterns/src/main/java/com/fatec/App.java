package com.fatec;

import com.fatec.strategy.Strategy;
import com.fatec.component.Component;
import com.fatec.component.Composite;
import com.fatec.component.Leaf;
import com.fatec.observer.Costumer;
import com.fatec.observer.Product;
import com.fatec.observer.Stock;
import com.fatec.strategy.ICMS;
import com.fatec.strategy.IPI;

public class App 
{
    public static void main( String[] args )
    {
        // Strategy Pattern: Define uma familia de algoritmos, encapsula cada um deles e os torna intercambiaveis.
        // Impostos devidem a mesma interface de calculo, podendo assim cada um aplicar um aliquota entre outras funcionalidades de forma independente.

        ICMS icms = new ICMS();
        icms.setAliquota(0.18);
        IPI ipi = new IPI();
        ipi.setAliquota(0.04);

        Strategy calculadora = new Strategy();
        System.out.println(calculadora.calcularPrecoFinal(icms, 100.0));
        System.out.println(calculadora.calcularPrecoFinal(ipi, 100.0));

        // Composite: Permite que você componha objetos em estruturas de árvore para representar hierarquias parte-todo.

        Component button1 = new Leaf("Botão 1");
        Component button2 = new Leaf("Botão 2");
        Component textField = new Leaf("Campo de texto");

        Composite panel = new Composite("Painel Principal");
        panel.add(button1);
        panel.add(button2);
        panel.add(textField);

        Composite menu = new Composite("Menu");
        menu.add(new Leaf("Item de Menu 1"));
        menu.add(new Leaf("Item de Menu 2"));
        Composite subMenu = new Composite("Sub Menu");
        subMenu.add(new Leaf("Item de Sub Menu 1"));
        subMenu.add(new Leaf("Item de Sub Menu 2"));
        menu.add(subMenu);
        panel.add(menu);
        panel.render();

        // Observer: Define uma dependencia um-para-muitos entre objetos, de maneira que quando um objeto muda de estado todos os seus dependentes são notificados e atualizados automaticamente.

        Product tenisNike = new Product("Tênis Nike", 100.0);

        Stock estoque = new Stock();
        Costumer mateus = new Costumer("Mateus");
        estoque.addObserver(mateus);
        estoque.addProduct(tenisNike, 2);
        Costumer teteu = new Costumer("Teteu");
        estoque.addObserver(teteu);
        estoque.updateStock(tenisNike, 5);


    }
}
