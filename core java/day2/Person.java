package nithaj;

public class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		Person obj=new Person("Nithaj",21);
		Person obj1=new Person("Babu",53);
		obj.display();
		obj1.display();
	}

}
