package nithaj;

public class Consoverload {
	Consoverload(String name) {
		System.out.println("welcome String");
	}
	Consoverload(int a,int b) {
		System.out.println("Sum " + (a+b));
	}
	Consoverload(int n) {
		System.out.println("sum " + (n+n));
	}

	public static void main(String[] args) {
		Consoverload obj1=new Consoverload("Nithaj");
		Consoverload obj2=new Consoverload(2,4);
		Consoverload obj3=new Consoverload(6);
		
	}

}
