package threadexample;


public class Sleep_03 extends Thread{  
	
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{
	    		Thread.sleep(2000);  // 2000 miliseconds = 2 secs
	    	}
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    }  
	    System.out.println(Thread.currentThread().getName()+ "  :"+ i);  
	  }  
	 }  
	 
	 public static void main(String args[]){  
	  Sleep_03 t1=new Sleep_03();  
	  t1.setName("Java");
	  t1.setPriority(MAX_PRIORITY); 
	  
	  Sleep_03 t2=new Sleep_03();  
	  t2.setName("Python");
	  
	  Sleep_03 t3=new Sleep_03(); 
	  t3.setName("Oracle");
	  
	  Sleep_03 t4=new Sleep_03(); 
	  t4.setName("C++");
	   
	  t1.start();  
	  t2.start();  
	  t3.start();
	  t4.start();
	  
	  System.out.println(t1.getState());
	  System.out.println(t3.getState());
	  System.out.println(t2.getState());
	 }  
	}  
