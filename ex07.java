// Storing objects in a HashMap and managing student information
import java.util.*;

class Student { // Class representing a student
    int id;
    String tel;
    public Student(int id, String tel) {
        this.id = id;
        this.tel = tel;
    }
}

public class ex07 {
    public static void main(String[] args) {
        // Create a HashMap collection to store (student name, Student object) pairs
        HashMap<String, Student> map = new HashMap<String, Student>();

        // Store 3 students
        map.put("Aaron Judge", new Student(1, "010-111-1111"));
        map.put("Fernando Tatis Jr.", new Student(2, "010-222-2222"));
        map.put("Pete Crow-Armstrong", new Student(3, "010-333-3333"));

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter the name to search: ");
            String name = scanner.nextLine(); // Input from user
            if(name.equals("exit")) // Exit the program if "exit" is entered
                break;
            Student student = map.get(name); // Search for the Student object by name
            if(student == null)
                System.out.println(name + " is not found.");
            else
                System.out.println("id: " + student.id + ", phone: " + student.tel);
        }
        scanner.close();
    }
}