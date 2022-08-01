package filehandlingproject;

import java.util.Scanner;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String args[]) {
		System.out.println("Enter the data :- ");
		Scanner sc =new Scanner(System.in);

	    String data =sc.nextLine();
	    
	    try {
	      // Step 1: Creates a Writer using FileWriter
	      FileWriter output = new FileWriter("C://Users//hp//Documents//Learning java//phase1.txt");

	      
	      // Step 2: Writes string to the file
	      (output).write(data);
	      System.out.println("Data is written to the file.");

	      // Step 3: Closes the writer
	      output.close();
	    }
	    catch (Exception e) {
	      e.getStackTrace();
	    }
	 }

}
