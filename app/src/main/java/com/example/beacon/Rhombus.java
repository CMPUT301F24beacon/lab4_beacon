package com.example.beacon;

public class Rhombus extends Shape {
    private double d_1;
    private double d_2;

    public Rhombus(double x, double y, double d_1, double d_2) {
        super(x, y);
        this.d_1 = d_1;
        this.d_2 = d_2;
    } 

   
    //setting the diagonals
    public double getd_1() {
        return d_1;
    }

   
    public void setd_1(double d_1) {
        this.d_1 = d_1;
    }


    public double getd_2() {
        return d_2;
    }

  
    public void setd_2(double d_2) {
        this.d_2 = d_2;
    }
    
  
}
