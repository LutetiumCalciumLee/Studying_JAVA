// A Circle class with two constructors
public class ex03_Circle {
	int radius ;
	String name ;
	
	public ex03_Circle() {
		radius = 1 ; name = "" ;
	}
	public ex03_Circle(int r, String n) {
		radius = r ; name = n ;
	}
	public double getArea() {
		return 3.14 * radius * radius ;
	}
	
	public static void main(String[] args) {
		ex03_Circle pizza = new ex03_Circle(10, "JAVA Pizza") ;
		
		double area = pizza.getArea() ;
		System.out.println("The area of " + pizza.name + " is " + area) ;
		
		ex03_Circle donut = new ex03_Circle() ;
		donut.name = "Donut Pizza" ;
		area = donut.getArea() ;
		System.out.println("The area of " + donut.name + " is " + area) ;
	}
}