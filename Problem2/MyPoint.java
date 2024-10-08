package Problem2;

public class MyPoint {
    private int x;
    private int y;

    // Constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // toString method for easy representation
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
