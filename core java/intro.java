import java.util.Scanner;
public class intro{
  public static void main(String args[]){
    
    int employeeId;
    String employeename;
    float employeeSalary;

    Sacnner sc = new Scanner(System.in);

    System.out.println("Enter the id: ");
    employeeId=sc.nextInt(); 
    System.out.println("Enter the name: ");
    employeename=sc.next();
    System.out.println("Enter the salary: ");
    employeeSalary=sc.nextFloat();

   System.out.println(employeeId); 
   System.out.println(employeename);  
   System.out.println(employeeSalary);      
 }
}