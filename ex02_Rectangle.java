// Practice Creating Ractangle Class
import java.util.Scanner ;

public class ex02_Rectangle {
	int width ;
	int height ;
	
	public int getArea() {
		return width * height ;
	}
	
	public static void main(String[] args) {
		ex02_Rectangle rect = new ex02_Rectangle() ;
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ") ;
		
		rect.width = scanner.nextInt() ;
		rect.height = scanner.nextInt() ;
		
		System.out.println("The area of the rectangle is " + rect.getArea()) ;
		
		scanner.close() ;
	}
}