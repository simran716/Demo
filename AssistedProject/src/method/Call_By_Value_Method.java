package method;

public class Call_By_Value_Method {
	int val=150;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}

	public static void main(String args[]) {
		Call_By_Value_Method d = new Call_By_Value_Method();
		System.out.println("Before operation value of data is "+d.val);
		int f= d.operation(100);
		System.out.println("After operation value of data is "+f);
		}

}
