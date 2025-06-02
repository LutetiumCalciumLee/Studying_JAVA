// Calculate the sum of positive numbers using the continue statement.
import java.util.Scanner ;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter 5 integers.") ;
        int sum = 0;
        for(int i = 0 ; i < 5 ; i++) {
            int n = scanner.nextInt() ; // Input an integer from the keyboard
            if(n <= 0) 
                continue ; 
            else 
                sum += n ;
        }
        System.out.println("The sum of positive numbers is " + sum) ;
        scanner.close() ;
    }
}