package nithaj;
import java.math.*;
public class Circle {
     double radius;
     double re,ret;
     Circle(double radius){
    	 this.radius=radius;
     }
     void setradius(double radius) {
    	 this.radius=radius;
     }
     double getradius(){
    	 return radius;
     }
     void display() {
    	 re= Math.PI * radius * radius;
    	 ret= 2 * Math.PI * radius;
    	 System.out.println(re);
         System.out.println(ret);	 
     }
	
	public static void main(String[] args) {
		Circle obj=new Circle(3.23456);
		obj.display();
		obj.setradius(4.6754);
		obj.display();
		

	}

}
