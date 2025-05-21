// Using if-else
import java.util.Scanner ;

public class ex11 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in) ;
		
		System.out.print("Enter the number : ") ;
		int number = in.nextInt() ;
		
		if (number % 3 == 0)
			System.out.println("It is a multiple of 3.") ;
		else
			System.out.println("It isn't a multiple of 3.");
		
		in.close();
	}
}