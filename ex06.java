// Exiting a while loop using the break statement
import java.util.Scanner ;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Type 'exit' to quit.") ;
        while(true) {
            System.out.print(">>") ;
            String text = scanner.nextLine() ;
            if(text.equals("exit"))
                break ;
        }
        System.out.println("Exiting...") ;
        scanner.close() ;
    }
}