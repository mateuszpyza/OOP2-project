package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldGetArea() {
        //given
        Rectangle rectangle = new Rectangle(2, 4);
        //when
        double result = rectangle.getArea();
        //then
        Assertions.assertEquals(result, 8);
    }

    @Test
    void shouldGetPerimeter() {
        //given
        Rectangle rectangle = new Rectangle(2, 4);
        //when
        double result = rectangle.getPerimeter();
        //then
        Assertions.assertEquals(result, 10);
    }
}