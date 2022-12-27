package models;

import interfaces.Geometry;

public class Square implements Geometry {
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return Math.pow(a, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }
}
