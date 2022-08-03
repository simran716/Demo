package practiceproject;

public class TwoDArrays_12 {
	public static void main(String[] args) 
    {  
        int[][] arr = { { 5, 2}, { 1,4 } }; 
  
        for (int i = 0; i < 2; i++) {                // for row
            for (int j = 0; j < 2; j++) {            // for column
                System.out.print(arr[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 

}
