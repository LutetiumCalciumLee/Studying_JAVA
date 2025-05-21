// Practice Keyboard Input Using Scanner
import java.util.Scanner ;

public class ex04 {
	public static void main(String args[]) {
		System.out.println("Enter your name, city, age, weight, and marital status separated by spaces.") ;
		Scanner scanner = new Scanner(System.in) ;
		
		String name = scanner.next() ;
		System.out.print("Your name is "+ name + ",") ;
		
		String city = scanner.next() ;
		System.out.print("city is "+ city + ",") ;
		
		int age = scanner.nextInt() ;
		System.out.print("age is "+ age + ",") ;
		
		double weight = scanner.nextDouble() ;
		System.out.print("weight is "+ weight + "kg, ") ;
		
		boolean single = scanner.nextBoolean() ;
		System.out.println("marital status is "+ single + ".") ;
		
		scanner.close() ;
	}
}
