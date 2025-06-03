// Practicing Constructor Declaration and Usage
public class ex04_Book {
	String title ;
	String author ;
	
	public ex04_Book(String t) {
		title = t ; author = "Unknown" ;
	}
	
	public ex04_Book(String t, String a) {
		title = t ; author = a ;
	}
	
	public static void main(String [] args) {
		ex04_Book littlePrince = new ex04_Book("The Little Prince", "Saint-Exupéry") ;
		ex04_Book loveStory = new ex04_Book("Chunhyangjeon") ;
		System.out.println(littlePrince.title + " " + littlePrince.author) ;
		System.out.println(loveStory.title + " " + loveStory.author) ;
	}
}