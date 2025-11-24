public class Rightside_patterns {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
    }
}
