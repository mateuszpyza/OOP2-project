package models;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @org.junit.jupiter.api.Test
    void shouldGetArea() {
        //given
        Circle circle = new Circle(2);
        //when
        double result = Math.PI * 4;
        //then
        Assertions.assertEquals(circle.getArea(), result);
    }

    @org.junit.jupiter.api.Test
    void shouldGetPerimeter() {
        //given
        Circle circle = new Circle(2);
        //when
        double result = Math.PI * 4;
        //then
        Assertions.assertEquals(circle.getArea(), result);
    }
}