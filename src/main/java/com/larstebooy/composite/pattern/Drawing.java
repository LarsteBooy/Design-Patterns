package com.larstebooy.composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    //collections of Shapes
    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for (Shape shape : shapes) {
            shape.draw(fillColor);
        }
    }

    //adding shape to drawing
    public void add(Shape shape){
        this.shapes.add(shape);
    }

    //removing shape from drawing
    public void remove(Shape shape){
        shapes.remove(shape);
    }

    //removing all the shapes
    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }

}
