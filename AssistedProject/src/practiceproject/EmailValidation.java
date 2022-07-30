package practiceproject;

import java.util.Scanner;

public class EmailValidation {
	static boolean isValid(String Email){
		String regex="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\."
				+ "[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+"
				+ "(?:\\.[a-zA-Z0-9-]+)*$";  
		return Email.matches(regex);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email id:-");
		String Email=sc.nextLine();
		System.out.println("The email id is:- "+Email);
		System.out.println("Is the above email Id valid? "+isValid(Email));
		
	}

}
