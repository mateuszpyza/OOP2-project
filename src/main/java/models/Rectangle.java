package models;

public class Rectangle extends Square {
    private final double lengthSecondSide;

    public Rectangle(double lengthFirstSide , double lengthSecondSide) {
        super(lengthFirstSide);
        this.lengthSecondSide = lengthSecondSide;
    }

    @Override
    public double getArea() {
        return lengthFirstSide * lengthSecondSide;
    }

    @Override
    public double getPerimeter() {
        return 2 * lengthFirstSide + 2 * lengthSecondSide;
    }
}
