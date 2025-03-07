package com.fatec.observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Stock {
    private Map<Product, Integer> stock = new HashMap<>();
    private Set<Observer> observers = new HashSet<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addProduct(Product product, Integer quantity) {
        stock.put(product, quantity);
        notifyObservers(product, quantity);
    }

    public void updateStock(Product product, Integer quantity) {
        stock.put(product, quantity);
        notifyObservers(product, quantity);
    }

    private void notifyObservers(Product product, Integer quantity) {
        for (Observer observer : observers) {
            observer.update(product, quantity);
        }
    }
}
