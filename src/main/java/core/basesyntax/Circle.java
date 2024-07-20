package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return Math.round(area);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle,"
                + " area: " + calculateArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }
}
