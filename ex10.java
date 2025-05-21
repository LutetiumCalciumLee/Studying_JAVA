// Using the if statement
import java.util.Scanner ;

public class ex10 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.print("Enter the score : ") ;
		int score = scanner.nextInt() ;
		if (score >= 70)
			System.out.println("Congratulations! You passed.") ;
		
		scanner.close() ;
	}
}