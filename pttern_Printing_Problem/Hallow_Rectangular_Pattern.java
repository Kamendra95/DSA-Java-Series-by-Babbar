package pttern_Printing_Problem;

public class Hallow_Rectangular_Pattern {
    public static void main(String[] args) {

        // int n = 6;
        // for (int row = 1; row <= n; row++) {

        // // For each row -> 6 columns
        // for (int col = 1; col <= 6; col++) {
        // if (row == 1 || row == n) {
        // System.out.print("* ");
        // }

        // else {
        // // Middle rows
        // if (col == 1 || col == 6) {
        // System.out.print("* ");
        // }

        // else {
        // // Middle columns
        // System.out.print(" ");
        // }
        // }
        // }
        // // Move to next row
        // System.out.println();
        // }




        // int n = 10;
        // for (int row = 1; row <= n; row++) {

        // if (row == 1 || row == 2 || row == n) {

        // for (int col = 1; col <= row; col++) {
        // System.out.print("* ");
        // }
        // } else {
        // System.out.print("* ");

        // for (int col = 1; col <= (row - 2); col++) {
        // System.out.print(" ");
        // }
        // System.out.print("* ");
        // }
        // System.out.println();
        // }



        
        int n = 5;
        for (int row = 1; row <= n; row++) {
            // for each row -> variable col
            // Part 1
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            // Part 2
            if (row == 1 || row == n) {
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("* ");
                }
            } else {
                // Middle rows
                // For 1 *
                System.out.print("* ");
                // 2r-3 (For Space)
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }
                // For 1 *
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
