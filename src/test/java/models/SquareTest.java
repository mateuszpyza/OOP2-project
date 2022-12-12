package models;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @org.junit.jupiter.api.Test
    void shouldGetArea() {
        //given
        Square square = new Square(2);
        //when
        double result = square.getArea();
        //then
        Assertions.assertEquals(result, 4);
    }

    @org.junit.jupiter.api.Test
    void shouldGetPerimeter() {
        //given
        Square square = new Square(2);
        //when
        double result = square.getPerimeter();
        //then
        Assertions.assertEquals(result, 8);
    }
}