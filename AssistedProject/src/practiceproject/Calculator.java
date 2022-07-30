package practiceproject;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number:- ");
		double num1=sc.nextDouble();
		System.out.println("Enter second number:- ");
		double num2=sc.nextDouble();
		System.out.println("Enter the operator (+,-,*,/)");
		char op = sc.next().charAt(0);
		double result =0;
		switch(op){
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default :
			System.out.println("You enter wrong input.");
		}
		System.out.println("Final result is:-");
		System.out.println();
		System.out.println(num1+" "+op+" "+num2+" ="+result);

	}
}
