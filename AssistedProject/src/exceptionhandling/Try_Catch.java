package exceptionhandling;

public class Try_Catch {
	public static void main(String[] args){
		int num1,num2,num3;
		num1=20;
		num2=0;
		
		try{
		  num3 = num1/num2;
		  System.out.println("Result is:- "+num3);		  
		}	
		catch(ArithmeticException ae){  // child
			System.out.println("Numbers cannot be divided by zero");
		}
		catch(Exception ae1) // parent
		{
			System.out.println("I am before the subclass exception");
		}
		finally
		{
			num3=num1+num2;              
			System.out.println("Result after addition is:-  "+num3);
			System.out.println("This block will always executed");
		}
	}

}
