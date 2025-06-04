// Managing Java course names and scores using a HashMap
import java.util.*;

public class ex06 {
    public static void main(String[] args) {
        // Create a HashMap collection to record users' names and scores
        HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();

        // Store 5 names and scores
        scoreMap.put("Mohamed Salah", 97);
        scoreMap.put("Kylian Mbappe", 88);
        scoreMap.put("Romelu Lukaku", 98);
        scoreMap.put("Harry Kane", 70);
        scoreMap.put("Ousmane Dembele", 99);

        System.out.println("Number of elements in HashMap: " + scoreMap.size());

        // Print all scores
        // Output all (key, value) pairs in javaScore
        // Retrieve the set collection of all keys (strings)
        Set<String> keys = scoreMap.keySet();

        // Return an iterator to access the strings in order
        Iterator<String> it = keys.iterator();

        while(it.hasNext()) {
            String name = it.next();
            int score = scoreMap.get(name);
            System.out.println(name + " : " + score);
        }
    }
} 