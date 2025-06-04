// Using a Vector<Integer> collection to handle only integers
import java.util.Vector;

public class ex01 {
    public static void main(String[] args) {
        // Create a generic vector to handle only integer values
        Vector<Integer> v = new Vector<Integer>();

        v.add(5);    // Add 5
        v.add(4);    // Add 4
        v.add(-1);   // Add -1

        // Insert an integer between elements
        v.add(2, 100); // Insert 100 at index 2 (between 4 and -1)

        System.out.println("Number of elements in the vector: " + v.size());
        System.out.println("Current capacity of the vector: " + v.capacity());

        // Print all integer elements
        for(int i = 0; i < v.size(); i++) {
            int n = v.get(i);
            System.out.println(n);
        }

        // Add up all integers in the vector
        int sum = 0;
        for(int i = 0; i < v.size(); i++) {
            int n = v.elementAt(i);
            sum += n;
        }
        System.out.println("Sum of integers in the vector: " + sum);
    }
}