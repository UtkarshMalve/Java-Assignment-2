package Pattern;

public class Pattern10 {

	public static void main(String[] args) {
		int rows = 5;

		for (int i = 1; i <= rows; i++) {

			int numberToPrint = (i % 2 == 1) ? 1 : 0;

			for (int j = 1; j <= i; j++) {
				System.out.print(numberToPrint + " ");
			}

			System.out.println();
		}
	}

}
