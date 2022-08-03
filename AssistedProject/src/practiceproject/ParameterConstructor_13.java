package practiceproject;


public class ParameterConstructor_13 {
	  int id;  
	    String name;  
	    
	   public ParameterConstructor_13(){   //default-no parameters
	    	System.out.println("Inside default constructor. ");
	    	
	        }  
	    
	    //creating a parameterized constructor  
	    public ParameterConstructor_13(int i,String n){   // two parameters
		    id = i;  
		    name = n;  
	    }  
	    
	    //method to display the values  
	    public void display()
	    {
	    	System.out.println(id+" "+name);
	    }  
	    
	   
	    public static void main(String args[]){  
	    
	    //creating objects and passing values 
	    	 
	    ParameterConstructor_13 s1 = new ParameterConstructor_13(112,"Hello");  
	    ParameterConstructor_13 s2 = new ParameterConstructor_13(203,"Bunny");  
	    
	    
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	   }  

}
