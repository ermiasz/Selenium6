package assignments;

import java.util.Scanner;

public class Assiginment3Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Type a number");

		Scanner userIn = new Scanner(System.in);

		int outnum = userIn.nextInt();
		for (int i = outnum; i >= 0; i = i - 1) {
			System.out.println(i);
		}

	}

}
