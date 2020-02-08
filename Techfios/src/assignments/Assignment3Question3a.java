package assignments;

import java.util.Scanner;

public class Assignment3Question3a {
	public static void main(String[] args) {

		double num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number 1:");
		num1 = scan.nextDouble();

		System.out.println("Please enter number 2:");
		num2 = scan.nextDouble();

		System.out.println("Enter your Operation (+,-,*,/)");
		char operation = scan.next().charAt(0);
		scan.close();
		double output;

		switch (operation) {
		case '+':
			output = num1 + num2;
			break;

		case '-':
			output = num1 - num2;
			break;

		case '*':
			output = num1 * num2;
			break;

		case '/':
			output = num1 / num2;
			break;

		default:
			System.out.println("No matchs for the options");
			return;

		}

		System.out.println(num1 + " " + operation + " " + num2 + ": " + output);
	}

}
