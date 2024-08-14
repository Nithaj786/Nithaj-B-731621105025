package nithaj;

class employ{
	
	void work() {
		System.out.println("I am new");
	}
	void getsalary() {
		System.out.println("I got salary");
	}
}

class HRmanager extends employ{
	void work() {
		System.out.println("I am changed");
	}
	void addemploy() {
		System.out.println("Employee added");
	}
	
}

public class Emphr {

	public static void main(String[] args) {
		HRmanager obj=new HRmanager();
		obj.work();
		obj.getsalary();
		obj.addemploy();
	}

}
