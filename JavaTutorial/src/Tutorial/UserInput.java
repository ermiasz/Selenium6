package Tutorial;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

//datatype variable= value is which the user is going to type
		Scanner sc = new Scanner(System.in);

		System.out.println("what is your name?");

		String name = sc.next();

		System.out.println("How old are you?");

		String age = sc.next();

		System.out.println(" Hello " + name);

		System.out.println("your age is " + age);

	}

}
