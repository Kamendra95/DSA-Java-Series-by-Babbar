package pttern_Printing_Problem;

public class Number_Pattren {
    public static void main(String[] args) {

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= row; col++) {
        //         System.out.print(col + " ");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // int count = 1;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= row; col++){
        //         System.out.print(count + " ");
        //         count++;
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= row; col++){
        //         int a = col; 
        //         int b = ('A' - 1);
        //         int ans = a + b;
        //         char finalAns = (char)ans;
        //         System.out.print(finalAns + " ");
        //     }
        //     System.out.println();
        // } 

        // int n = 5;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= row; col++){
        //         int a = n - col;
        //         int b = 'A';
        //         int ans = a + b;
        //         char finalAns = (char)ans;
        //         System.out.print(finalAns + " ");
        //     }
        //     System.out.println();
        // }


        // int n = 4;
        // for(int row = 1; row <= n; row++){
        //     // Part 1
        //     for(int col = 1; col <= n-row; col++){
        //         System.out.print("  ");
        //     }
        //     // Part 2
        //     for(int col = 1; col <= row; col++){
        //         System.out.print(col + "  ");
        //     }
        //     //Part 3
        //     int rowValue = row;
        //     int decRowValue = row - 1;
        //     for(int col = 1; col <= row-1; col++){
        //         System.out.print(decRowValue+ "  ");
        //         decRowValue--;
        //     }
        //     System.out.println();
        // }


        // int n = 4;
        // for(int row = 1; row <= n; row++){
        //     // Part 1
        //     for(int col = 1; col <= n-row; col++){
        //         System.out.print("  ");
        //     }
        //     // Part 2
        //     for(int col = 1; col <= (2*row)-1; col++){
        //         System.out.print(row+ " ");
        //     }
        //     System.out.println();
        // }

        int n = 4;
        for(int row = 1; row <= n; row++){
            // Par 1
            for(int col = 1; col < n-row; col++){
                System.out.print("  ");
            }
            // Part 2
            for(int col = 1; col <= row; col++){
                int a = col; 
                int b = 'A'-1;
                int ans = a + b;
                char finalAns = (char)ans;
                System.out.print(finalAns + " ");
            }
            // Part 3
            char toPrint = (char)(row + 'A' -2);
            for(int col = 1; col <= row-1; col++){
                System.out.print(toPrint +" ");
                toPrint--;
            }
            System.out.println();
        }
    }
}
