package models;

public class Rectangle extends Shape {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {

        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * a + 2 * b;
    }
}
