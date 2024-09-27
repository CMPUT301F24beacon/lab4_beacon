public class Square extends Shape {
    private double sideLength;

    public Square(int x, int y, double sideLength) {
        super(x, y);  
        this.sideLength = sideLength;
    }

    
    public double getArea() {
        return sideLength * sideLength;
    }

    
    public double getSideLength() {
        return sideLength;
    }

  
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Square with side length: " + sideLength + " at position (" + x + ", " + y + ")";
    }
}
