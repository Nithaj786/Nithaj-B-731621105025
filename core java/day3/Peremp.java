package nithaj;

class Perso{
	void getFirstname() {
		System.out.println("I am First");
	}
	void getLastname() {
		System.out.println("I am last");
	}
}

class Emplo extends Perso{
	
	void Employeeid() {
		System.out.println("Emp ID is declared");
	}
	@Override
	void getLastname() {
		System.out.println("I am a SDE");
		super.getLastname();
	}
	
}

public class Peremp {

	public static void main(String[] args) {
		Emplo obj=new Emplo();
		obj.Employeeid();
		obj.getFirstname();
		obj.getLastname();
	}

}
