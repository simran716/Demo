package accessmodifier1;
import accessmodifier.TestY;

public class TestA {
	
	void defaultMethod(){
		System.out.println("Inside the default method of class TestA");
	}

	public static void main(String[] args) {
		new TestY().methodPublic();
	}

}

