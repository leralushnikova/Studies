package Shape;

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle("синий", 1, 2, 5);
        Shape s1 = new Rectangle("красный", 1, 2, 3, 5);
        Shape[] shapes = new Shape[]{s, s1};
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println(shape);// shape.toString()==shape
        }
    }
}
