// The / and % arithmetic operators
import java.util.Scanner ;

public class ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.print("Enter the integer: ") ;
		int time = scanner.nextInt() ;
		int second = time % 60 ;
		int minute = (time / 60) % 60 ;
		int hour = (time / 60) / 60 ;
		
		System.out.print(time + " seconds is ") ;
		System.out.print(hour + "hours, ") ;
		System.out.print(minute + "minutes, ") ;
		System.out.print(second + "seconds ") ;
		
		scanner.close() ;
	}
}
