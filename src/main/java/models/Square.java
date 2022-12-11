package models;

public class Square extends Shape {

    protected final double lengthFirstSide;

    public Square(double a) {
        this.lengthFirstSide = a;
    }

    @Override
    public double getArea() {
        return Math.pow(lengthFirstSide, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * lengthFirstSide;
    }
}
