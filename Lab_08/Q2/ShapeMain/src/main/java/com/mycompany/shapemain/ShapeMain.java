package com.mycompany.shapemain;
public class ShapeMain {
    public static void main(String[] args) {
        // Create instances of Circle, Rectangle, and Triangle
        Circle circle = new Circle(4.0);
        Rectangle rectangle = new Rectangle(8.0, 10.0);
        Triangle triangle = new Triangle(4.0, 5.0, 6.0);

        // Display information and calculations for each shape
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println();

        System.out.println("Rectangle:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println();

        System.out.println("Triangle:");
        System.out.println("Side A: " + triangle.getSideA());
        System.out.println("Side B: " + triangle.getSideB());
        System.out.println("Side C: " + triangle.getSideC());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
