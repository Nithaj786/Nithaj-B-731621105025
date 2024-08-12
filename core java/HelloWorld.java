import java.util.*;
import java.lang.Math;
class HelloWorld {
    int nithaj=10;
    public static void check(Object x ,Object y){
      if(x==y){
          System.out.println("both are same");
      }else{
           System.out.println("both are not same");
      }
  }
  
  
    public static void main(String[] args) {
 //FIBONACI       
 int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2); 
    
 for(i=2;i<count;++i)   
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 } 
 //FACTORIAL
 int no=5,result=1;
 for(int j=no;j>1;j--){
     result*=j;
 }
 System.out.println();
 System.out.println(" "+result);
 
 //PALINDROME
 String m1="gladgod",m2="";
 for (int k=0;k<m1.length();k++){
     m2=m1.charAt(k)+m2;
 }System .out.println(m2);
 if(m1==m2){
     System.out.println("it is Palindrome");
 }else {
      System.out.println("it is not Palindrome");
 }
 
 //ARMSTRONG NO
 String no1="123";
 int no2=Integer.parseInt(no1);
 int resul=0;
 for (int l=0;l<no1.length();l++){
     int res=Character.getNumericValue(no1.charAt(l));
     resul += Math.pow(res,no1.length());
 }System.out.println(resul);
 if(no2==resul){
     System.out.println("it is Armstrong");
 }else{
     System.out.println("it is not Armstrong");
 }
 //PRIME NO
 
int in=5,coun=0;
for(int m=1;m<=in;m++){
    if(in%m==0){
        coun++;
    }
}
if(coun==2){
    System.out.println(in + " It is PRIME NO");
}else{
    System.out.println(in + " It is Not PRIME NO");
}

//RANDOM NO
int ran=(int)(Math.random()*10001);
System.out.println(ran);
 
 //COMPARE OBJECT
  String st1="nithaj";
  String st2="nithaj";
  check(st1,st2);
 
 //ASCII VALUE
 char asc='A';
 int asci=asc;
 System.out.println(asci);
 
 //PATTERN
 int pat=5;
 for(int q=0;q<=pat;q++){
     for(int r=0;r<=q;r++){
         System.out.print("*");
     } System.out.println();
 }
 
 
 //CREATE OBJECT
 HelloWorld nit=new HelloWorld();
 System.out.println(nit.nithaj);
 
    }
}