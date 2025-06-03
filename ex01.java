// Finding out object properties using the Object class
class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ex01 {
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName()); // Class name
        System.out.println(obj.hashCode()); // Hash code value
        System.out.println(obj.toString()); // Print object as a string
        System.out.println(obj); // Print object
    }
    public static void main(String [] args) {
        Point p = new Point(2,3);
        print(p);
    }
}