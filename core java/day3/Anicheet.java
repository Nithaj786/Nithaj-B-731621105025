package nithaj;

class Animal{
	void move() {
		System.out.println("It was move");
	}
}

class Cheetha extends Animal{
	
	void move() {
		System.out.println("It was Running");
//		super.makesofund(a);
	}
	
}

public class Anicheet {

	public static void main(String[] args) {
		Cheetha obj=new Cheetha();
		obj.move();

	}

}
