package Pattern;

public class Pattern4 {

	public static void main(String[] args) {
		int rows = 4;

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < 4; j++) {

				char ch = (char) ('A' + i + j);
				System.out.print(ch + " ");
			}

			System.out.println();
		}
	}

}
