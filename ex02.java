// Calculate the average of the numbers entered until -1 is entered.
import java.util.Scanner ;

public class ex02 {
	public static void main(String[] args) {
        int count = 0 ;
        int sum = 0 ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter integers and enter -1 at the end.") ; 
        int n = scanner.nextInt() ; 
        while(n != -1) { 
            sum += n ;
            count++ ;
            n = scanner.nextInt() ; 
        }
        if(count == 0) 
            System.out.println("No numbers were entered.") ;
        else {
            System.out.print("The number of integers is " + count + " and ") ;
            System.out.println("the average is " + (double)sum/count + ".") ;
        }
        scanner.close() ;
	}
}