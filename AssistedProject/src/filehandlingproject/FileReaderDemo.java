package filehandlingproject;
import java.io.FileReader;
public class FileReaderDemo {
	public static void main(String[] args) {


	 char[] array = new char[60];
	    
	  try {
	      // Step 1: Creates a reader using the FileReader
	      FileReader input = new FileReader("C://Users//hp//Documents//Learning java//phase1.txt");

	      // Step 2: Reads characters
	      input.read(array);
	      
	      System.out.println("Data in the file:");
	      System.out.println(array);

	      // Step 3: Closes the reader
	      input.close();
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
	  }

}
