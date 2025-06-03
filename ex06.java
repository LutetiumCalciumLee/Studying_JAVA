// Method Overriding
class Weapon {
	protected int fire() {
		return 1 ;
	}
}

class Cannon extends Weapon {
	@Override
	protected int fire() {
		return 10 ;
	}
}

public class ex06 {
	public static void main(String[] args) {
		Weapon weapon ;
		weapon = new Weapon() ;
		System.out.println("The killing power of the basic weapon is " + weapon.fire()) ;
		weapon = new Cannon() ;
		System.out.println("The killing power of the cannon is " + weapon.fire()) ;

	}
}