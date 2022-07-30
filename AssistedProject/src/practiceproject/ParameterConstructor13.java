package practiceproject;


public class ParameterConstructor13 {
	  int id;  
	    String name;  
	    
	   public ParameterConstructor13(){   //default-no parameters
	    	System.out.println("Inside default constructor. ");
	    	
	        }  
	    
	    //creating a parameterized constructor  
	    public ParameterConstructor13(int i,String n){   // two parameters
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
	    	 
	    ParameterConstructor13 s1 = new ParameterConstructor13(112,"Hello");  
	    ParameterConstructor13 s2 = new ParameterConstructor13(203,"Bunny");  
	    
	    
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	   }  

}
