package Pattern;

public class Pattern17 {
	public static void main(String[] args) {
		int numberOfRows = 6;

		for (int i = 0; i <= numberOfRows - 1; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k <= numberOfRows - 1 - i; k++) {
				System.out.print("*" + " ");
			}

			System.out.println();
		}
	}
}