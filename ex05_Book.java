// Calling another constructor with this()
public class ex05_Book {
	String title ;
	String author ;
	void show() { System.out.println(title + " " + author) ; }
	
	public ex05_Book() {
		this("","") ;
		System.out.println("Constructor called") ;
	}
	
	public ex05_Book(String title) {
		this(title, "Unknown") ;
	}
	
	public ex05_Book(String title, String author) {
		this.title = title ; this.author = author ;
	}
	
	public static void main(String [] args) {
		ex05_Book littlePrince = new ex05_Book("The Little Prince", "Saint-Exupéry") ;
		ex05_Book loveStory = new ex05_Book("Chunhyangjeon") ;
		System.out.println(littlePrince.title + " " + littlePrince.author) ;
		System.out.println(loveStory.title + " " + loveStory.author) ;
	}
}