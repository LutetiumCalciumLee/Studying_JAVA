// Access modifiers of members
class Sample {
	public int a ;
	private int b ;
	int c ;
}

public class ex10_AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample() ; 
		aClass.a = 10 ;
		aClass.b = 10 ;
		aClass.c = 10 ;
	}
}
// Since b is declared as private, it cannot be accessed: this is indeed an error.