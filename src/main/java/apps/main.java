package apps;

import models.Square;

public class main {

    public static void main(String[] arg) {
        Square square = new Square(6);
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
    }
}
