package filehandlingproject;


import java.io.*;

public class FileInput {
	 public static void main(String args[]) throws IOException 
	  { 

	      //attach the file to FileInputStream 
	      FileInputStream fin= new FileInputStream("C://Users//hp//Documents//Learning java//phase2.txt"); 

	      //illustrating getChannel() method 
	      System.out.println(fin.getChannel()); 
	     
	      System.out.println("Number of bytes read:"+fin.available()); 

	      //illustrating skip method 
	      fin.skip(7); 
	      System.out.println("FileContents :"); 
	      //read characters from FileInputStream and write them 
	      int ch; 
	      while((ch=fin.read())!=-1) 
	          System.out.print((char)ch); 
	        
	      //close the file 
	      fin.close(); 
} 


}
