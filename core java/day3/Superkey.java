package nithaj;

class  A{
	int a=10;
	A(String name){
		System.out.println("I am A");
	}
	void my1() {
		System.out.println("A void method");
	}
}

class B extends A{
	B(){
		super("Nithaj");
	}
	void my2() {
		System.out.println("B void method" + super.a);
	}
}

public class Superkey {

	public static void main(String[] args) {
		B obj = new B();
		obj.my1();
		obj.my2();

	}

}
