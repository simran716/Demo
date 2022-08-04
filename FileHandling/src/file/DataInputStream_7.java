package file;
import java.io.*;
import java.io.DataInputStream; 

public class DataInputStream_7 {
	
	 public static void main(String[] args) throws IOException {  
		    
			InputStream input = new FileInputStream("C://Users//hp//Documents//Learning java//phase3.txt");  
		    DataInputStream inst = new DataInputStream(input);  
		    
		    int count = input.available();  
		    System.out.println(count);
		    
		    byte[] ary = new byte[count];  
		    inst.read(ary);  
		    for (byte bt : ary) {  
		      char k = (char) bt;  
		      System.out.print(k+"-");  
		    }  
		  }  
}
