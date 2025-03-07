package br.edu.fatec.factory;

class Diamond implements Calculable{
    private double d1;
    private double d2;

    public Diamond(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public double calcularArea() {
        return (d1 * d2) / 2;
    }
    
}
