package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double range;

    public Circle(double range) {
        this.range = range;
    }

    public String getShape() {
        return "Circle";
    }
    public double getField() {
        return 3.14159265359 * range * range;
    }
}
