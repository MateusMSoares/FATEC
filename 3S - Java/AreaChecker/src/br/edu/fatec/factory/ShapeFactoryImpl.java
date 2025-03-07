package br.edu.fatec.factory;

public class ShapeFactoryImpl implements ShapeFactory{
    public Calculable retorno = null;


    @Override
     public Calculable getShape(ShapeType type, Double[] values){
        switch(type){
            case SQUARE:
                retorno = new Square(values[0]);
                break;
            case RECTANGLE:
                retorno = new Rectangle(values[0], values[1]);
                break;
            case CIRCLE:
                retorno = new Circle(values[0]);
                break;
            case CUBE:
                retorno = new Cube(values[0]);
                break;
            case DIAMOND:
                retorno = new Diamond(values[0], values[1]);
                break;
            case HEXAGON:
                retorno = new Hexagono(values[0]);
                break;
            case PARALLELOGRAM:
                retorno = new Parallelogram(values[0], values[1]);
                break;
            case TRAPEZO:
                retorno = new Trapezo(values[0], values[1], values[2]);
                break;
            case TRIANGLE:
                retorno = new Triangle(values[0], values[1]);
                break;
            
        }
        return retorno;
    }

}
