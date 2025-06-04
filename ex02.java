// Using a Vector<Point> collection to handle only Point objects
import java.util.Vector;

class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

public class ex02 {
    public static void main(String[] args) {
        // Create a vector that contains only Point objects as elements
        Vector<Point> v = new Vector<Point>();

        // Insert three Point objects
        v.add(new Point(2, 3));
        v.add(new Point(-5, 20));
        v.add(new Point(30, -8));

        v.remove(1); // Remove the Point(-5, 20) object at index 1

        // Search and print all Point objects in the vector
        for (int i = 0; i < v.size(); i++) {
            Point p = v.get(i); // Retrieve the current Point object from the vector
            System.out.println(p); // Print the object p using toString()
        }
    }
}