package nithaj;

class MyClass {
	//variable
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	//constructor
	MyClass (int employeeId, String employeeName, float employeeSalary){
		this.employeeId = employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	//method
	void display() {
		System.out.println("EID" + employeeId);
		System.out.println("ENAME " + employeeName);
		System.out.println("ESALARY " + employeeSalary);
	}
}

public class Employee {

	public static void main(String[] args) {
         MyClass empl=new MyClass(101,"Nithaj",50000);
         empl.display();
         
         MyClass empl2=new MyClass(102,"babu",60000);
         empl2.display();
 
	}

}
