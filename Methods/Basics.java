package Methods;

public class Basics {

    static void print2KaTable() {
        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println(ans);
        }
    }

    static void printSum(int x, int y) {
        System.out.println("Sum: " + (x + y));
    }

    static void printMultiPlication(int a, int b){
        int ans = a*b;
        System.out.println("Multiplication: " + ans);
    }

    static int add(int p, int q){
        int sum = p + q;
        return sum;
    }

    static int add(int a, int b, int c){
        int ans = a+b+c;
        return ans;
    }


    public static void main(String[] args) {

        int ans1 = add(3, 5, 6);
        System.out.println("ans1: "+ ans1);

        int result = add(12,13);
        System.out.println("Result: " + result);

        // printSum(5, 6);

        // printMultiPlication(4, 5);

        // System.out.println("Hii");
        // print2KaTable();
        // System.out.println("Bye");
    }
}
