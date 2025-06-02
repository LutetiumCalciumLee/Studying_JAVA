// Find the largest number among the numbers entered into the array.
import java.util.Scanner ;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int intArray[] = new int[5] ;
        int max = 0 ;
        System.out.println("Enter 5 positive integers.") ;
        for(int i = 0; i < 5; i++) {
            intArray[i] = scanner.nextInt() ;
            if(intArray[i] > max)
                max = intArray[i] ;
        }
        System.out.print("The largest number is " + max + ".") ;
        scanner.close() ;
    }
}