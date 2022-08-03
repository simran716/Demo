package exceptionhandling;

import java.util.Scanner;

public class Customerexception {
	static void validate(int salary)throws InvalidSalaryException{  
	     if(salary<2100)  
	      throw new InvalidSalaryException("You need to work hard");  
	     else if (salary>=2100 && salary< 5000) {
	    	 throw new InvalidSalaryException("Your salary is somehow good");  
	     }
	     else{
	    	 throw new InvalidSalaryException("Your salary is very good");
	     }
	   }  
	     
	   public static void main(String args[]){ 
		   System.out.println("Enter salary:- ");
		   Scanner sc=new Scanner(System.in);
		   int salary = sc.nextInt();
	      try{  
	        validate(salary);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      }  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  

//This class is created for your own defined exception message
class InvalidSalaryException extends Exception{  // 1

	InvalidSalaryException(String s){  //2
	  super(s);  
	 }  

}
