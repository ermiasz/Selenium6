package Tutorial;

import java.util.Calendar;
import java.util.Scanner;

public class CalculatingAge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("what is your name");

		String name = sc.next();

		System.out.println("what year you were born?");

		int year = sc.nextInt();

		Calendar cal = Calendar.getInstance(); // formula for calculator

		int yearborn = cal.get(Calendar.YEAR); // formula for calculator

		int age = yearborn - year;

		System.out.println(name + "  your are  " + age + " year old  ");

	}

}
