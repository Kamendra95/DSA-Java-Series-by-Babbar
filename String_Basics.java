import java.util.Scanner;
public class String_Basics {
    public static void main(String[]args){
        // String firstName = "Kamendra";
        // String lastName = "Sharma";
        // System.out.println(firstName + " " + lastName);
        // System.out.println(firstName.length());
        // System.out.println(firstName.charAt(4));

        // Taking input in String
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide the string content: ");
        String str = sc.nextLine();
        System.out.println("Value of nextLine: " + str);
     
        System.out.print("Provide the string content: ");
        String str2 = sc.next();
        System.out.print("Value of next: " + str2);
    }
}
