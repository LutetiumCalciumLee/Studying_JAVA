// Receiving string input and storing it in an ArrayList
import java.util.*;

public class ex03 {
    public static void main(String[] args) {
        // Create an ArrayList collection that can only store strings
        ArrayList<String> a = new ArrayList<String>();

        // Input 4 names from the keyboard and insert them into the ArrayList
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter a name>>");
            String s = scanner.next(); // Input a name from the keyboard
            a.add(s); // Insert into the ArrayList collection
        }

        // Print all the names stored in the ArrayList
        for (int i = 0; i < a.size(); i++) {
            String name = a.get(i); // Get the i-th string from the ArrayList
            System.out.print(name + " ");
        }

        // Print the longest name
        int longestIndex = 0;
        for (int i = 1; i < a.size(); i++) {
            if (a.get(longestIndex).length() < a.get(i).length())
                longestIndex = i;
        }
        System.out.println("\nThe longest name is: " + a.get(longestIndex));

        scanner.close();
    }
}