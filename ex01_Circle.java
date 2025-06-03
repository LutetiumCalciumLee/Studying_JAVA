// Creating and Using Objects of the Circle Class
public class ex01_Circle {
	int radius ;
	String name ; 
	
	public ex01_Circle() { }
	
	public double getArea() {
		return 3.14*radius*radius ;
	}
	
	public static void main(String[] args) {
		ex01_Circle pizza ;
		pizza = new ex01_Circle() ;
		pizza.radius = 10 ;
		pizza.name = "JAVA Pizza" ;
		double area = pizza.getArea() ;
		System.out.println("The area of " + pizza.name + " is " + area) ;
		
		ex01_Circle donut = new ex01_Circle() ;
		donut.radius = 2 ;
		donut.name = "JAVA Donut" ;
		area = donut.getArea() ;
		System.out.println("The area of " + donut.name + " is " + area) ;
	}
}