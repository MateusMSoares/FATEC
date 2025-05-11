import java.util.ArrayList;
import java.util.List;

public class Circle implements Shape {
    private DrawStrategy drawStrategy;
    private List<ShapeObserver> observers = new ArrayList<>();

    public void draw() {
        drawStrategy.draw("Circle");
    }

    public void setDrawStrategy(DrawStrategy strategy) {
        this.drawStrategy = strategy;
        notifyObservers();
    }

    public void attach(ShapeObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (ShapeObserver obs : observers) {
            obs.onShapeChanged(this);
        }
    }

    public String toString() {
        return "Circle";
    }
}
