package com.Alec.module1.two;

import com.Alec.module1.one.TwoDShape;

public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Calculates area for a circle
    @Override
    public double getArea() {
        return PI*radius*radius;
    }
}
