import java.util.Scanner;
public class TakingInput {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for firstNum: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the value for secondNum: ");
        int secondNum = sc.nextInt();
        int ans = firstNum + secondNum;
        System.out.println("Total value is: " + ans);
    }
}
