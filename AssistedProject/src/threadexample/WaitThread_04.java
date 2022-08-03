package threadexample;
class Printer 
{ 
    
    int noOfPaper = 100;  
    synchronized void printingPages(int pages) 
    { 
        System.out.println("Printing the Pages"); 
        for(int i = 0; i < 100; i++)
        {
            
        }
        if (this.noOfPaper < pages) { 
            System.out.println("Number of Papers in printer are less"); 
            try 
            { 
                System.out.println("Waiting...");
                wait(); 
            } 
            catch (Exception e) 
            { 
                
            } 
        } 
        
        System.out.println("After called notify() method number of Paper : " +    this.noOfPaper); 
        System.out.println("Printing process complete");
         
    } 
    synchronized void addPages(int noOfPages) 
    { 
         
        this.noOfPaper += noOfPages; 
        notify(); 
    } 
} 
public class WaitThread_04 { 
    public static void main(String args[]) 
    { 
        Printer printer = new Printer(); 
        new Thread() 
        { 
            
            public void run() 
            { 
               
                printer.printingPages(120); 
            } 
        }.start(); 
        
        new Thread() { 
            @Override
            public void run() 
            { 
                printer.addPages(100); 
            } 
        }.start(); 
    } 
} 
