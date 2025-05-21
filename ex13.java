// Example of Nested if-else Statement
import java.util.Scanner ;

public class ex13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.print("Enter the score(0-100) : ") ;
		int score = scanner.nextInt() ;
		
		System.out.print("Enter your grade leve(1-4) : ") ;
		int year = scanner.nextInt() ;
		
		if(score >= 60) {
			if(year != 4)
				System.out.println("Pass!") ;
			else if(score >= 70)
				System.out.println("Pass!") ;
			else 
				System.out.println("Fail") ;
		}
		else
			System.out.println("Fail") ;
		
		scanner.close();
	}
}