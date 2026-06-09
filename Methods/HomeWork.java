package Methods;

import java.util.Scanner;

public class HomeWork {
    
    // Question No. 1
    static void PrintWelcomeMessage(){
        System.out.println("Welcome Message");
    }

    // Question No. 2
    static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    // Question No. 3
    static boolean isEven(int number){
        return number % 2 == 0;
    }

    // Question No. 4
    static int getMaximum(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }

    // Question No. 5
    static int calculatePercentage(int obtained, int total){
        return(obtained * 100) / total;
    }

    // Question No. 6
    static void display() {
        System.out.println("No arguments");
    }
    static void display(int num) {
        System.out.println("Number: " + num);
    }
    static void display(String text) {
        System.out.println("Text: " + text);
    }

    public static void main(String[]args){

        PrintWelcomeMessage();

         int Sum = add(5, 5);
        System.out.println("Sum: " + Sum);

        int num = 9;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enet your number: ");
        // int num = sc.nextInt();
        if(isEven(num)){
            System.out.println("Even");
        }
        else{
            System.out.println("Not Even");
        }

        int result = getMaximum(10, 20);
        System.out.println("Maximum number: " + result);

        double percentage = calculatePercentage(90, 100);
        System.out.println("Percentage: " + percentage + "%");

        display();
        display(10);
        display("Hello");

    }
}

