// Write a toString() method in the Point class.
class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Point(" + x + "," + y + ")";
    }
}

public class ex02 {
    public static void main(String [] args) {
        Point p = new Point(2,3);
        System.out.println(p.toString());
        System.out.println(p); // p is automatically converted to p.toString()
        System.out.println(p + " is the value."); // Automatically converted to p.toString() + " is the value."
    }
}