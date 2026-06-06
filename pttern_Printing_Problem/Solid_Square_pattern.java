package pttern_Printing_Problem;
public class Solid_Square_pattern {
    public static void main(String[]args){

        int n = 8;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
