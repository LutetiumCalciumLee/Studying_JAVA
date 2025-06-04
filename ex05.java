// Using HashMap to store and search (English, Korean) word pairs
import java.util.*;

public class ex05 {
	public static void main(String[] args) {
		//Creating a HashMap collection to store pairs of English and Korean words
		HashMap<String, String> dic =
				new HashMap<String, String>();
		
		// Store three (key, value) pairs in dic
		dic.put("baby", "아기"); // "baby" is key, "아기" is value
		dic.put("love", "사랑"); 
		dic.put("apple", "사과");
		
		// Receive an English word as input and search for the Korean word. Exit when "exit" is entered.
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Which word do you want to search for? ");
			String eng = scanner.next();
			if (eng.equals("exit")) {
			System.out.println("Exiting...");
			break;
			}
			
			// Search for the value kor of the key eng in the hash map
			String kor = dic.get(eng);
			if(kor == null)
			System.out.println(eng + " is not in the dictionary.");
			else
			System.out.println(kor);
		}
		scanner.close();
	}
}