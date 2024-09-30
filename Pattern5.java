package Pattern;

public class Pattern5 {

	public static void main(String[] args) {
		int rows = 4;

		int cols = 4;

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				System.out.print((i + j) % 2 + " ");
			}

			System.out.println();
		}
	}

}
