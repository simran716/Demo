package method;

public class Method_1 {
	public static void main(String[] args) {
	      int a = 34;
	      int b = 23;
	      int c = maxFunction(a, b);
	      System.out.println("Maximum Value = " + c);
	   }

	   public static int maxFunction(int n1, int n2) {
	      int max;
	      if (n1 > n2)
	         max = n1;
	      else
	         max = n2;
	      return max; 
	   }

}
