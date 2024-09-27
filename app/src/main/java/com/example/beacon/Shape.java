package com.example.beacon;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.color = "red";
    }

    public int getX() {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y =y;
    }

    private void setColor(String color)
    {
        this.color = color;
    }

    private String getColor()
    {
        return color;
    }

}
