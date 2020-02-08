package assignments;

import java.util.Scanner;

public class Assignment3Question1 {

	public static void main(String[] args) {

		// Question 1

		System.out.println("Type a number");

		Scanner userInput = new Scanner(System.in);
		int output = userInput.nextInt();

		System.out.println("1" + " ");
		for (int i = 4; i <= output; i = i + 4) {
			System.out.println(i);
		}

	}

}
