package br.edu.fatec.factory;

class Circle implements Calculable{
    private final double pi = 3.4;
    private double raio;

    public Circle(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return pi * (raio * raio);
    }
    
}
