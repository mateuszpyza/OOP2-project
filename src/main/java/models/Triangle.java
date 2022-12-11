package models;

public class Triangle extends Shape {
    public final double lengthFirstSide;
    double lengthSecondSide;
    double lengthThirdSide;

    public Triangle(double lengthFirstSide, double lengthSecondSide, double lengthThirdSide) {
        this.lengthFirstSide = lengthFirstSide;
        this.lengthSecondSide = lengthSecondSide;
        this.lengthThirdSide = lengthThirdSide;

    }
    @Override
    public double getArea() {
        double p = 0.5 * getPerimeter();
        return Math.pow(p * (p - lengthFirstSide) * (p - lengthSecondSide) * (p - lengthThirdSide), 0.5);
    }
    @Override
    public double getPerimeter() {
        return lengthFirstSide + lengthSecondSide + lengthThirdSide;
    }
}
