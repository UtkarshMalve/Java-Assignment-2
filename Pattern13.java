package Pattern;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many rows you want in this pattern?");

		int rows = sc.nextInt();

		System.out.println("Here is your pattern....!!!");

		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			for (int j = i; j < 2 * i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		sc.close();
	}
}
