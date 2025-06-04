// Printing all elements of a Vector and calculating the sum using an Iterator
import java.util.*;

public class ex04 {
    public static void main(String[] args) {
        // Create a generic vector to handle integer values
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);    // Insert 5
        v.add(4);    // Insert 4
        v.add(-1);   // Insert -1
        v.add(2, 100); // Insert 100 between 4 and -1

        // Print all integers using an Iterator
        Iterator<Integer> it = v.iterator();
        while(it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }

        // Calculate the sum of all integers using an Iterator
        int sum = 0;
        it = v.iterator(); // Get a new Iterator object
        while(it.hasNext()) {
            int n = it.next();
            sum += n;
        }
        System.out.println("Sum of integers in the vector: " + sum);
    }
}