package com.company.lesson4.geometry;

public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape();
        drawShape(shape);

        Circle circle = new Circle();
        drawShape(circle);

        Square square = new Square();
        drawShape(square);

        Triangle triangle = new Triangle();
        drawShape(triangle);

    }

    public static void drawShape(Shape shape) {
        shape.draw();
    }


}
