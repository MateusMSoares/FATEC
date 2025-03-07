package com.fatec.strategy;

public class Strategy{

    public Double calcularPrecoFinal(Imposto imposto, Double valor){
        Double valorImposto = imposto.calcular(valor);
        System.out.print("Calculando imposto: " + imposto.getNOME() +  " Valor: " + valorImposto + " Valor total: ");   
        return valorImposto + valor;
    }

}
