package Pattern;

public class Pattern9 {

	public static void main(String[] args) {

		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			int num = i;

			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}

			System.out.println();
		}
	}
}
