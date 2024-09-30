package Pattern;

public class Pattern19 {

	public static void main(String[] args) {

		int rows = 5;

		for (int i = 1; i <= rows; i++) {

			if (i == 1 || i == 2) {

				for (int j = 0; j < 6; j++) {
					System.out.print(" ");
				}
				System.out.println("x");
			}

			else if (i == 3) {
				System.out.println("x  x  x  x  x");
			}

			else {

				for (int j = 0; j < 6; j++) {
					System.out.print(" ");
				}
				System.out.println("x");
			}
		}
	}
}
