package com.example.beacon;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    //getters
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return  height;
    }
    //setters
    public void setHeight (int height) {
        this.height = height;
    }
    public void setWidth (int width) {
        this.width = width;
    }


}
