public class MainDraw {
    public static void main(String[] args) throws Exception {
        Shape circle = new Circle();
        Shape anotherCircle = new Circle();
        ShapeGroup group = new ShapeGroup();
        group.add(circle);
        group.add(anotherCircle);

        ShapeObserver logger = new LoggerObserver();
        group.attach(logger);

        group.setDrawStrategy(new DrawWithBorder());
        group.draw();

        System.out.println("Mudando a estratégia...");
        group.setDrawStrategy(new DrawWithShadow());
        group.draw();

    }
}
