package Shape;

import java.util.Objects;

public class Circle extends Shape{
    private int x, y, radios;

    public Circle(String color, int x, int y, int radios) {
        super(color);
        this.x = x;
        this.y = y;
        this.radios = radios;
    }
    @Override
    public void draw() {
        System.out.println("Нарисован круг " + getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return x == circle.x && y == circle.y && radios == circle.radios;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y, radios);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radios=" + radios +
                "} " + super.toString();
    }
}
