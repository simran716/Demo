package file;


import java.io.*;

public class BufferInputStream_6 {
	 public static void main(String args[]) throws IOException 
	    { 
	        // attach the file to FileInputStream 
	        FileInputStream fin = new FileInputStream("C://Users//hp//Documents//Learning java//phase3.txt"); 
	  
	        BufferedInputStream bin = new BufferedInputStream(fin); 
	  
	        // illustrating available method 
	        System.out.println("Number of remaining bytes:" + 
	                                            bin.available()); 
	  
	        // illustrating markSupported() and mark() method 
	        boolean b=bin.markSupported(); 
	        if (b) 
	            bin.mark(bin.available()); 
	  
	        bin.skip(4); 
	        System.out.println("FileContents :"); 
	  
	        // read characters from FileInputStream and 
	        // write them 
	        int ch; 
	        while ((ch=bin.read()) != -1) 
	            System.out.print((char)ch); 
	  
	        // illustrating reset() method 
	        bin.reset(); 
	        while ((ch=bin.read()) != -1) 
	            System.out.print((char)ch); 
	  
	        // close the file 
	        fin.close(); 
	    } 

}
