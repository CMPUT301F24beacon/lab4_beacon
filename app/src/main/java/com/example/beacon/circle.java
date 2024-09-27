package com.example.beacon;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "circle of radius: " + radius + " at position (" + x + ", " + y + ")";
    }
}
