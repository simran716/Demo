package accessmodifier1;
import accessmodifier.TestY;

public class TestB extends TestY {

	public static void main(String[] args) {
		new TestY().methodPublic();
		
		//TestB  b = new TestB();
		//b.methodProtected(); // compile time error

		// works, accessing super class protected method using subclass
		new TestB().methodProtected();
		new TestY().methodPublic();

	}
}
