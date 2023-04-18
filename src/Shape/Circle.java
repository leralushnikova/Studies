package Shape;

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
}
