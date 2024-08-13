package nithaj;

public class variable {
	int b=20;//instance variable
	static int c= 30;

	public static void main(String[] args) {
		int a=10;
		System.out.println("local variable " + a);
		
		variable obj=new variable();
		System.out.println(obj.b);
		
		System.out.println(variable.c);

	}

}
