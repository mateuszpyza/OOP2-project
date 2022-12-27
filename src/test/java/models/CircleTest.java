package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CircleTest {

    @Test
    void shouldGetArea() {
        //given
        Circle circle = new Circle(2);
        //when
        double result = Math.PI * 4;
        //then
        Assertions.assertEquals(circle.getArea(), result);
    }

    @Test
    void shouldGetPerimeter() {
        //given
        Circle circle = new Circle(2);
        //when
        double result = Math.PI * 4;
        //then
        Assertions.assertEquals(circle.getArea(), result);
    }
}