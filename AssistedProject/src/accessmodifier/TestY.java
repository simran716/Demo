package accessmodifier;

import accessmodifier.TestX;

public class TestY {
	public static void main(String args[]) {
		new TestX().methodPublic();
		new TestX().methodProtected();
		new TestX().methodDefault(); 
		System.out.println("Value of long:- "+ new TestX().k);		
	}

	public void methodPublic() {
		System.out.println("Class TestB: methodPublic");
	}

	protected void methodProtected() {
		System.out.println("Class TestB: methodProtected");
		
	}

	void methodDefault() {
		System.out.println("Class TestB: methodDefault");
	}

	private void methodPrivate() {
		System.out.println("Class TestB: methodPrivate");
	}


}
