package student;

import java.util.Scanner;

public class Test1
{
	
	
	  public static void main(String args[])
	  {
		  
		  System.out.println("if you want add option=1");
		   System.out.println("if you want updat option =2");
		   System.out.println("if you want delete option =3");
		System.out.println("plese enter your option");
		
		  Scanner scr=new Scanner(System.in);
		  
		  int n=scr.nextInt(); 
		  
		  System.out.println("enter your id");
		  int id =scr.nextInt();
		  System.out.println("enter your name");
		  String name=scr.next();
		  
	   details obj=new details();
	   obj.setId(id);
	   obj.setName(name);
	   StudDAO obj1= new StudDAO();
	  
		 
		 if(n==1)
		 {
			 
		      obj1.Add(obj);
		      
		 }
		 else if(n==2)
		 {
	         obj1.UpDate(obj);
		 }
		 else if(n==3)
		 {  
			 obj1.Delete(obj);
		 }
	   
	  }
	   

	
	
}
