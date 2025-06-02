// When a program is forcibly terminated due to an exception caused by division by zero
import java.util.Scanner ;

public class ex14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int dividend ;
		int divisor ;
		
		System.out.print("Enter the dividend : ") ;
		dividend = scanner.nextInt();
		System.out.print("Enter the divisor : ") ;
		divisor = scanner.nextInt() ;
		System.out.println("When you divide " + dividend + " by " + divisor 
				+ ", the quotient is " + (dividend/divisor) + ".") ;
		scanner.close();
	}
}
