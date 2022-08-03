package threadexample;

public class RunnableExample_01  implements Runnable{  
	
	public void run(){  
	System.out.println("Thread is running...");  
	}  
	  
	public static void main(String args[]){  
	
	RunnableExample_01 m1=new RunnableExample_01();     
	Thread t1 = new Thread(m1);                     
	t1.start();                                     
 }  

}
