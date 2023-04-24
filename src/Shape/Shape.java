package Shape;

public abstract class Shape {
    private String color;
    public abstract void draw();

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


}
