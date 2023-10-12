package Inputmethod;

import java.util.Scanner;

public class Input {

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number :");
		int a  = sc.nextInt();
		System.out.println("Enter Second number :");
		int b = sc.nextInt();
		System.out.println("press 1 for addition :");
		System.out.println("Press 2 for subtraction :");
		System.out.println("Press 3 for multiplication :");
		System.out.println("Press 4 for Division :");
		System.out.println("PRess 5 for Reminder :");
		int Button = sc.nextInt();
		switch(Button) {
		case 1:
			int sum = a+b;
			System.out.println("Your addition is :" + sum);
			break;
		case 2:
			int sub = a-b;
			System.out.println("Your subtraction is :" + sub);
			break;
		case 3:
			int multi = a*b;
			System.out.println("Your Multiplication is :" + multi);
			break;
		case 4:
			float div = a/b;
			System.out.println("Your division is :" + div);
			break;
		case 5 :
			int rem = a%b;
			System.out.println("Your Reminder is :" + rem);
			break;
			
			default :System.out.println("Invalid Button , Please press from 1-5 only");
		
		}
	}

}
