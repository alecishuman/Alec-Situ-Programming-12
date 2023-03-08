package com.Alec.module1.one;

import com.Alec.module1.four.Colour;

public class TwoDShape {
    double width;
    double height;
    Colour colour;

    public TwoDShape(double width, double height, Colour colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public TwoDShape() {

    }

    // Calculates area for a rectangle
    public double getArea() {
        return width * height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
