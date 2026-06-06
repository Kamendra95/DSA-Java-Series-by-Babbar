package pttern_Printing_Problem;

public class Solid_Right_Angle_Triangle_Pattern {
    public static void main(String[]args){

        // int n = 5;
        // for(int row = 1; row <= n; row++){
        //     for(int clo = 1; clo <= row; clo++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col<=n-row; col++){
        //         System.out.print(" ");
        //     }
        //     for(int col = 1; col <= n; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // int n = 5;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= n-row+1; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        
        // int n = 5;

        // for(int row = 1; row <= n; row++){

        //     for(int col = 1; col <= n-row; col++){
        //         System.out.print(" ");
        //     }

        //     for(int col = 1; col <= 2*row-1; col++){
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }


        int n = 4;
        for(int row = 1; row <= n; row++){

            for(int col = 1; col<=row-1; col++){
                System.out.print(" ");
            }

            for(int col = 1; col<=2*n-2*row+1; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
