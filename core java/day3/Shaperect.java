package nithaj;

class Shape{
	
	void getarea(int l,int b) {
		System.out.println("sound was created");
	}
}

class Rectangl extends Shape{
	int res;
	void getarea(int  l,int b) {
		res=2*l+b;
		System.out.println(res);
	}
	
}


public class Shaperect {

	public static void main(String[] args) {
		Rectangl obj=new Rectangl();
//		obj.get();
		obj.getarea(3, 8);
		
	}

}
