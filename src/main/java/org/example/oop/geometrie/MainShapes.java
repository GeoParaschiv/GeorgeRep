package org.example.oop.geometrie;

import java.util.ArrayList;
import java.util.List;

public class MainShapes {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        //Shape shape3 = new Shape();

        //shape1.draw();
        //shape2.draw();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(shape1);
        shapes.add(shape2);

        for (Shape shape : shapes){
            shape.draw();
        }

    }
}
