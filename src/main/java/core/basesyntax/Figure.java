package core.basesyntax;

public abstract class Figure implements AreaProvider, Drawable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
