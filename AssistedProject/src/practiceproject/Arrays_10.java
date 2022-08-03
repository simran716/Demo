package practiceproject;

public class Arrays_10 {
	public static void main(String[] args) {
	      
		  int[] myList = {8, 2, 9, 17};

	      // Print all the array elements
	      for (int i = 0; i < myList.length; i++) {
	         System.out.println(myList[i] + " " +i);
	      }
	      
	      int ar[] = new int[4]; //integer array - 4 elements
	      int size = ar.length;
	      System.out.println("Size of array is :- " + size);
	      //System.out.println("fifth:" + ar[5]);
	      
	     
	      // Summing all elements
	      int total = 0;
	      for (int i = 0; i < myList.length; i++) {
	         total += myList[i];
	      }
	      System.out.println("Total is " + total);
	      
	      
	      // Finding the largest element
	      int max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) 
	        	 {
	        	    max = myList[i];
	        	 }
	      }
	      System.out.println("Max is array list:- " + max);  
	   }
	   
	   
}


