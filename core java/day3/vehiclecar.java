package nithaj;

class Vehicle{
	void drive(int a) {
		System.out.println("sound was created");
	}
}

class car extends Vehicle{
	
	void drive(int  a) {
		System.out.println("Reparing a Car");
//		super.makesofund(a);
	}
	
}

public class vehiclecar {

	public static void main(String[] args) {
		car obj=new car();
		obj.drive(6);

	}

}
