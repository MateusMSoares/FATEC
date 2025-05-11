import java.util.ArrayList;
import java.util.List;

public class ShapeGroup implements Shape {
    private List<Shape> children = new ArrayList<>();
    private DrawStrategy drawStrategy;
    private List<ShapeObserver> observers = new ArrayList<>();

    public void add(Shape shape) {
        children.add(shape);
    }

    public void draw() {
        for (Shape shape : children) {
            shape.draw();
        }
    }

    public void setDrawStrategy(DrawStrategy strategy) {
        this.drawStrategy = strategy;
        for (Shape shape : children) {
            shape.setDrawStrategy(strategy);
        }
        notifyObservers();
    }

    public DrawStrategy getDrawStrategy(){
        return this.drawStrategy;
    }

    public void attach(ShapeObserver observer) {
        observers.add(observer);
        for (Shape shape : children) {
            shape.attach(observer);
        }
    }

    public void notifyObservers() {
        for (ShapeObserver obs : observers) {
            obs.onShapeChanged(this);
        }
    }

    public String toString() {
        return "ShapeGroup";
    }

}
