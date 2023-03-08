package com.Alec.module1.one;

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
    }

}