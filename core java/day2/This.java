package nithaj;

public class This {
   String name;
   This(String name,int c){
	   this(2, 3);
	   this.name=name;
	   this.greeting();
   }
   
   This(int a, int b){
	   System.out.println("Addition " + (a+b));
   }
   
   void greeting() {
	   System.out.println("Welcome "+ name);
   }
	public static void main(String[] args) {
		This obj=new This("Nithaj",4);
//	    This obj1=new This(2,3);

	}

}
