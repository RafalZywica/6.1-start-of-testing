package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double basis;
    private double height;

    public Triangle(double basis, double height) {
        this.basis = basis;
        this.height = height;
    }

    public String getShape() {
        return "Triangle";
    }
    public double getField() {
        return basis * height * 0.5 ;
    }
}
