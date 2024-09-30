package Pattern;
public class Pattern18 {

    public static void main(String[] args) {
        int rows = 6; // Total number of rows

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print("  "); // Two spaces for better alignment
            }

            // Print numbers starting from i to 6
            for (int j = i; j <= rows; j++) {
                System.out.print(j + "  ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
