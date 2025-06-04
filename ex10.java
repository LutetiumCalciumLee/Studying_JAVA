// Creating a generic method to reverse the contents of a stack
public class ex10 {
    // Generic method with type parameter T
    public static <T> GStack<T> reverse(GStack<T> a) {
        GStack<T> s = new GStack<T>();
        while (true) {
            T tmp;
            tmp = a.pop(); // Remove an element from the original stack
            if (tmp == null) // If the stack is empty
                break;
            else
                s.push(tmp); // Insert the element into the new stack
        }
        return s; // Return the new stack
    }

    public static void main(String[] args) {
        // Create a GStack of type Double
        GStack<Double> gs = new GStack<Double>();

        // Push 5 elements onto the stack
        for (int i = 0; i < 5; i++) {
            gs.push(new Double(i));
        }

        gs = reverse(gs); // Reverse the stack

        for (int i = 0; i < 5; i++) {
            System.out.println(gs.pop());
        }
    }
}