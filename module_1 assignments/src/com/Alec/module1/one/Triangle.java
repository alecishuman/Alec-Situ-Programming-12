package com.Alec.module1.one;

import com.Alec.module1.four.Colour;
import com.Alec.module1.three.Rotate;

public class Triangle extends TwoDShape implements Rotate {
    double side1;
    double side2;
    double side3;
    double angle;

    public Triangle(double width, double height, Colour colour) {
        super(width, height, colour);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private double heronsHeight() {
        return 2*getArea()/side1;
    }

    // Calculates the area for a triangle
    @Override
    public double getArea() {
        double s = (side1+side2+side3) / 2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    public void rotate90() {
        angle += 90;
    }

    @Override
    public void rotate180() {
        angle += 180;
    }

    @Override
    public void rotate(double degree) {
        angle += degree;
    }
}
