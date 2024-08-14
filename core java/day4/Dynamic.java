package glad1;

class Animala{
	void move() {
		System.out.println("All animals move from one place to another");
	}
	
	void eat() {
		System.out.println("All eat Something");
	}
}

class Doggie extends Animala{
	void move() {
		System.out.println("Dog walk in Two legs");
	}
	
	void eat() {
		System.out.println("Dog also eat Shit");
	}
}



public class Dynamic {

	public static void main(String[] args) {
		Animala dog;
		dog = new Doggie();
		dog.move();
		dog.eat();

	}

}
