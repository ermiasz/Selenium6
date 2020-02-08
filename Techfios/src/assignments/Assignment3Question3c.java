package assignments;

import java.util.Scanner;

public class Assignment3Question3c {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("This is a Basic Calculator");
		System.out.println("Enter your first Number:");
		double first = scan.nextDouble();

		System.out.println("Enter your second Number:");
		double second = scan.nextDouble();

		System.out.println("Enter your Operation (+,-,*,/)");
		String opt = scan.next();

		if (opt.equals("+")) {
			// Do Add
			add(first, second);

		} else if (opt.equals("-")) {
			sub(first, second);
		} else if (opt.equals("*")) {
			multi(first, second);
		} else if (opt.equals("/")) {
			div(first, second);
		} else {
			System.out.println("Your input did not match any of the followings:+,-,*,/ ");
		}
	}

	public static double add(double number1, double number2) {
		double result = number1 + number2;
		return result;
	}

	public static void sub(double number1, double number2) {
		System.out.println(number1 - number2);
	}

	public static void multi(double number1, double number2) {
		System.out.println(number1 * number2);
	}

	public static void div(double number1, double number2) {
		System.out.println(number1 / number2);
	}

}
