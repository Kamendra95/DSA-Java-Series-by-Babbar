package pttern_Printing_Problem;

public class Butter_Fly_Pattern {
    public static void main(String[] args) {

        int n = 4;
        for (int row = 1; row <= n; row++) {
            // Part 1
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            // Part 2
            for (int col = 1; col <= 2 * (n - row); col++) {
                System.out.print("  ");
            }

            // Part 3
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        
        for (int row = 1; row <= n; row++) {

            // Part 4
            for (int col = 1; col <= (n - row) + 1; col++) {
                System.out.print("* ");
            }

            // Part 5
            for (int col = 1; col <= (row - 1) * 2; col++) {
                System.out.print("  ");
            }

            // Part 6
            for (int col = 1; col <= (n - row) + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

