package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TriangleTest {

    @Test
    void shouldGetArea() {
        //given
        Triangle triangle = new Triangle(3, 4, 5);
        //when
        double result = triangle.getArea();
        //then
        Assertions.assertEquals(result, 6);
    }

    @Test
    void shouldGetPerimeter() {
        //given
        Triangle triangle = new Triangle(3, 4, 5);
        //when
        double result = triangle.getPerimeter();
        //then
        Assertions.assertEquals(result, 12);

    }
}