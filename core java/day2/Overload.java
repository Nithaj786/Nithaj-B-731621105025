package nithaj;

public class Overload {
	void my1(String name) {
		System.out.println("welcome String");
	}
	void my1(int a,int b) {
		System.out.println("Sum " + (a+b));
	}
	void my1(int n) {
		System.out.println("sum " + (n+n));
	}

	public static void main(String[] args) {
		Overload obj=new Overload();
		obj.my1(5);
		obj.my1("nithaj");
		obj.my1(3, 5);
	}

}
