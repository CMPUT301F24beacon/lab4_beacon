package com.example.beacon;

public class Rhombus extends Shape {
    private double d_1;
    private double d_2;

    // Constructor
    public Rhombus(double x, double y, double d_1, double d_2) {
        super(x, y);
        this.d_1 = d_1;
        this.d_2 = d_2;
    }

    // Getter for diagonal 1
    public double getD_1() {
        return d_1;
    }

    // Setter for diagonal 1
    public void setD_1(double d_1) {
        this.d_1 = d_1;
    }

    // Getter for diagonal 2
    public double getD_2() {
        return d_2;
    }

    // Setter for diagonal 2
    public void setD_2(double d_2) {
        this.d_2 = d_2;
    }
}    