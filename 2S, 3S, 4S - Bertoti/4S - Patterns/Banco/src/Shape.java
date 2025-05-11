public interface Shape {
    void draw();
    void setDrawStrategy(DrawStrategy strategy);
    void attach(ShapeObserver observer);
    void notifyObservers();

}
