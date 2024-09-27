package com.example.beacon;

public class triangle extends Shape {
    int z;


    public triangle(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
