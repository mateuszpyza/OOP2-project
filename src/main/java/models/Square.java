package models;

import interfaces.Geometry;

public class Square implements Geometry {
    private final double lengthSide;

    public Square(double a) {
        this.lengthSide = a;
    }

    @Override
    public double getArea() {
        return Math.pow(lengthSide, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * lengthSide;
    }
}
