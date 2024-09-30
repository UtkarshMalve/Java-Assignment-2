package Pattern;

public class Pattern14 {

	public static void main(String[] args) {

		int rows = 5;
		int currentNumber = 1;

		System.out.println("Here is your pattern....!!!");

		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				if (currentNumber <= 15) {
					System.out.print(currentNumber + " ");
					currentNumber++;
				}
			}

			System.out.println();
		}
	}
}
