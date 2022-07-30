package practiceproject;

public class StringBuilder9 {
	public static void main(String args[]){  
		 
		   String s = "Simran";  // String Literal---> objects are created in string pool
		   String p = "Simran";
		   
		   if(s.equals(p))
		   {
			   System.out.println("true, s is equal to p");
		   }
		   else{
			   System.out.println("false , s is not equal to p");
		   }
		   
		   s.concat(" Gill");       //concat() method appends the string at the end  
		   s = s.concat(" Gill");
		   
		   System.out.println(s);       
		   
		   if(s.equals(p))
		   {
			   System.out.println("true....");
		   }
		   else{
			   System.out.println("false....");
		   }
		   
		   String s4 = "Hello";     // --> string pool object creation
		   String s5 = "Hello";
		   if(s4.equals(s5))
		   {
			   System.out.println("true, s4 is equal to s5");
		   }
		   else{
			   System.out.println("false, s4 is not equal to s5");
		   }
		   
		   // objects are created inside the heap
		   String s1 = new String("Hello");
		   String s2 = new String("Hello");
		  
		   
		   if(s1.equals(s2))
		   {
			   System.out.println("true, s1 is equal to s2");
		   }
		   else{
			   System.out.println("false, s1 is not equal to s2");
		   }
    }  

}
