// Utilizing the Collections Class
import java.util.*;

public class ex08 {
    static void printList(LinkedList<String> l) {
        Iterator<String> iterator = l.iterator();
        while (iterator.hasNext()) {
            String e = iterator.next();
            String separator;
            if (iterator.hasNext())
                separator = "->";
            else
                separator = "\n";
            System.out.print(e + separator);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("Transformers");
        myList.add("Star Wars");
        myList.add("Matrix");
        myList.add("Terminator");
        myList.add(2, "Avatar");

        Collections.sort(myList); // Sort the elements
        printList(myList); // Print sorted elements

        Collections.reverse(myList); // Reverse the order of the elements
        printList(myList); // Print elements

        int index = Collections.binarySearch(myList, "Avatar") + 1;
        System.out.println("\"Avatar\" is the " + index + "th element.");
    }
}