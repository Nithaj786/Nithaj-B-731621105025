package nithaj;

class Animal{
	void makesound(int a) {
		System.out.println("sound was created");
	}
}

class cat extends Animal{
	
	void makesound(int  a) {
		System.out.println("It was cat sound");
//		super.makesofund(a);
	}
	
}

public class Animalcat {
	public static void main(String[] args) {
		cat obj=new cat();
		obj.makesound(5);
	}

}
