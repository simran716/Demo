package practiceproject;

public class Constructor_04 {
	int id;   // class variables
	String name;  
		
	public Constructor_04()  // default constructor
	{ 
		id= 10;
		name = "Hello";
		System.out.println("I m inside the default constructor");
	}
	
	//method to display the value of id and name  
	void display()  //default modifier
	{
		System.out.println(id+" "+name);
	}  
	  
public static void main(String args[]){ 
	//creating objects  
	Constructor_04 s1;  //Instance variables
	s1 =new Constructor_04();
	
	Constructor_04 s2=new Constructor_04();  // object of class
	
	//displaying values of the object  
	s1.display();  
	s2.display();  
    }  

}
