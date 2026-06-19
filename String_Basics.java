import java.util.Scanner;
public class String_Basics {




    // Question no. 1 
    static void printString(String str){
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    // Question No. 2
    static int getLengthOfString(String str){
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }

    // Question No. 3
    static int getVowelsCount(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                count++;
            }
        }
        return count;
    }

    // Question No. 4
    static String reverseString(String str) {
        String reverse = "";
        int n = str.length();
        for(int i=n-1; i>=0; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    } 
    
    // Question No. 5
    static boolean isPalindrome(String str) {
        String original = str;
        String reverse = reverseString(original);
        // Compare
        for(int i=0; i<original.length(); i++){
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if(ch1 != ch2){
                // No match
                return false;
            }
        }
        return true;
    }


    public static void main(String[]args){

        // String firstName = "Kamendra";
        // String lastName = "Sharma";
        // System.out.println(firstName + " " + lastName);
        // System.out.println(firstName.length());
        // System.out.println(firstName.charAt(4));


        // // >>>>>>>>>>>>>>>>>>>>>>>> Comparing strings
        // String name1 = "Kamendra";
        // String name2 = "Kamendra";
        // if(name1.equals(name2)){
        //     System.out.println("Both strings are equal");
        // }
        // else{
        //     System.out.println("Both strings are not equal");
        // }


        // // >>>>>>>>>>>>>>>>>>>>>>>>>Taking input in String
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Provide the string content: ");
        // String str = sc.nextLine();
        // System.out.println("Value of nextLine: " + str);
     
        // System.out.print("Provide the string content: ");
        // String str2 = sc.next();
        // System.out.print("Value of next: " + str2);


        // // >>>>>>>>>>>>>>>>>>>>>>>>>>>> Common String Methods
        // String str = "My name is Kamendra";
        // // 0 index par M hai 
        // // 1 index par y hai
        // // 2 index par space hai, and so on
        // System.out.println(str.substring(3, 7));
        // // beginIndex -> 3 -> inclusive
        // // endIndex -> 7 -> exclusive
        // System.out.println(str.contains("Kamendra"));

        // String str1 = " ";
        // System.out.println(str1.length());
        // System.out.println(str1.isEmpty());
        // System.out.println(str1.isBlank());

        // String name = "  Kamendra   ";
        // System.out.println(name.length());
        // name = name.trim();
        // System.out.println(name.length());
        // String name1 = "Love";
        // System.out.println(name1.toUpperCase());
        // String name2 = "LOVE";
        // System.out.println(name2.toLowerCase());

        // int num = 1234;
        // String str2 = String.valueOf(num);
        // System.out.println(num + 1);
        // System.out.println(str2 + 1);

        // String name3 = "Kamendra Kumar Sharma";
        // System.out.println(name3.startsWith("Kamendra Ku"));
        // System.out.println(name3.endsWith("ar Sharma"));

        // String name4 = "Kamendra";
        // char[] crr = name4.toCharArray();
        // for(char ch: crr){
        //     System.out.println("Value of char: " + ch);
        // }

        // String input = "My,name,is,Kamendra";
        // String[] words = input.split(",");
        // for(String str5: words){
        //     System.out.println(str5);
        // }

        // String name6 = "Kamendra";
        // name6 = name6.replace('a','b');
        // System.out.println(name6);





        // Question no. 1
        String str = "KamendrA";
        printString(str);

        // Qyestion No. 2
        System.out.println(getLengthOfString(str));

        // Question No. 3
        System.out.println(getVowelsCount(str));

        // Question No. 4
        System.out.println(reverseString(str));

        // Question No. 5
        System.out.println(isPalindrome(str));
    }
}
