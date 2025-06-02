// Using for-each statement
public class ex09 {
	enum Week {Sun,Mon,Tues,Wednes,Thurs,Fri,Satur}
	
	public static void main(String[]args) {
		int [] n = {1,2,3,4,5} ;
		String names[] = {"apple", "pear", "banana", "cherry", "strawberry", "grape"} ;
		
		int sum = 0 ;
		for (int k : n) {
			System.out.print(k + " ") ;
			sum += k ;
		}
		System.out.println("Sum is " + sum) ;
		
		for (String s : names)
			System.out.print(s + " ") ;
		System.out.println() ;
		
		for (Week day : Week.values())
			System.out.print(day + "day ") ;
		System.out.println() ;
	}
}