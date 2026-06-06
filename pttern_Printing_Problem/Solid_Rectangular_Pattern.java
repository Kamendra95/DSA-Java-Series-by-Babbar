package pttern_Printing_Problem;

public class Solid_Rectangular_Pattern {
    public static void main(String[]args){

        for(int row = 1; row <= 3; row++){
            for(int col = 1; col <= 5; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
