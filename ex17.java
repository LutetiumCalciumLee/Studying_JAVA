// Exception Occurring Due to Input Error (InputMismatchException)
import java.util.Scanner ;
import java.util.InputMismatchException ;

public class ex17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter three integers. ") ;
		int sum = 0 , n = 0 ;
		for (int i = 0 ; i<3 ; i++) {
			System.out.print(i+">>") ;
			try {
				n = scanner.nextInt() ;
			}
			catch(InputMismatchException e) {
				System.out.println("That is not an integer. Please enter again!");
				scanner.next() ;
				i-- ;
				continue ;
			}
			sum += n ;
		}
		System.out.println("Total is " + sum) ;
		scanner.close() ;
	}
}