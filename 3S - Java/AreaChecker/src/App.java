import br.edu.fatec.factory.Calculable;
import br.edu.fatec.factory.ShapeFactory;
import br.edu.fatec.factory.ShapeFactoryImpl;
import br.edu.fatec.factory.ShapeType;

public class App {
    public static void main(String[] args) throws Exception {
       ShapeFactory sf = new ShapeFactoryImpl();
       
        Calculable forma = sf.getShape(ShapeType.SQUARE, new Double[] {5.0});
        double resultado = forma.calcularArea();
        System.out.println("Área do Quadrado: " + resultado);

        Calculable f1 = sf.getShape(ShapeType.CIRCLE, new Double[] {5.0});
        resultado = f1.calcularArea();
        System.out.println("Área do Círculo: " + resultado);

        Calculable f2 = sf.getShape(ShapeType.CUBE, new Double[] {5.0});
        resultado = f2.calcularArea();
        System.out.println("Área do Cubo: " + resultado);

        Calculable f3 = sf.getShape(ShapeType.DIAMOND, new Double[] {5.0, 15.0});
        resultado = f3.calcularArea();
        System.out.println("Área do Losango: " + resultado);

        Calculable f4 = sf.getShape(ShapeType.HEXAGON, new Double[] {5.0});
        resultado = f4.calcularArea();
        System.out.println("Área do Hexágono: " + resultado);

        Calculable f5 = sf.getShape(ShapeType.PARALLELOGRAM, new Double[] {5.0, 8.0});
        resultado = f5.calcularArea();
        System.out.println("Área do Paralelogramo: " + resultado);

        Calculable f6 = sf.getShape(ShapeType.RECTANGLE, new Double[] {5.0, 9.0});
        resultado = f6.calcularArea();
        System.out.println("Área do Retângulo: " + resultado);

        Calculable f7 = sf.getShape(ShapeType.TRIANGLE, new Double[] {5.0, 12.0});
        resultado = f7.calcularArea();
        System.out.println("Área do Triângulo: " + resultado);
      
    }
}
