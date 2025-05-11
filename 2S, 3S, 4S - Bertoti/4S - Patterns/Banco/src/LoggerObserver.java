public class LoggerObserver implements ShapeObserver {
    public void onShapeChanged(Shape shape) {
        System.out.println("Logger: Shape changed: " + shape);
    }
}
