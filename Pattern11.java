package Pattern;

public class Pattern11 {

	public static void main(String[] args) {
		int rows = 6;

		for (int i = 1; i <= rows; i++) {

			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
