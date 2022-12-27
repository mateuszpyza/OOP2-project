package models;

import interfaces.Geometry;

public class Triangle implements Geometry {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = 0.5 * getPerimeter();
        return Math.pow(p * (p - a) * (p - b) * (p - c), 0.5);
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
