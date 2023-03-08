package com.Alec.module1.one;

import com.Alec.module1.four.Colour;
import com.Alec.module1.two.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaTest {
    /**
     * Calculate the area of any 2d shape, including rectangle, triangle, circle.
     *
     * return: number with area
     */

    @org.junit.jupiter.api.Test
    void getTriangleArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6, triangle.getArea());

        Circle circle = new Circle(6.5);
        assertEquals(5.5*5.5*Math.PI, circle.getArea());

        TwoDShape rectangle = new TwoDShape(7, 8.1, Colour.RED);
        assertEquals(56.7, rectangle.getArea());
    }

}