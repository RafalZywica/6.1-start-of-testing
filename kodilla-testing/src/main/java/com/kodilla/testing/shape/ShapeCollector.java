package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();
    private String names = "";

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n) {
        return shapes.get(n);
    }
    public String showFigures() {
        for (int i = 0; i < shapes.size(); i++) {
            names = names + shapes.get(i).getShape();
        }
        return names;
    }
}
