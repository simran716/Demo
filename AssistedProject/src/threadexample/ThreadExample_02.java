package threadexample;

public class ThreadExample_02 extends Thread{  
		
		public void run(){  
		  System.out.println("Thread is running...");  
		}  
		
		public static void main(String args[]){  
		
		ThreadExample_02 t1=new ThreadExample_02();  
		t1.start();                           
	 }  
	}  


