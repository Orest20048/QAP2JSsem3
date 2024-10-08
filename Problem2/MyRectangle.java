package Problem2;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Method to calculate area
    public double getArea() {
        int width = bottomRight.getX() - topLeft.getX();
        int height = bottomRight.getY() - topLeft.getY();
        return width * height;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        int width = bottomRight.getX() - topLeft.getX();
        int height = bottomRight.getY() - topLeft.getY();
        return 2 * (width + height);
    }

    // toString method for easy representation
    @Override
    public String toString() {
        return "Rectangle [Top Left: " + topLeft + ", Bottom Right: " + bottomRight + "]";
    }
}
