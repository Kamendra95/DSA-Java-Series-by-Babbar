public class BitwiseOperator {
    public static void main(String[]args){

        // int a = 5;
        // int b = 6;
        // System.out.println(a & b);
        // System.out.println(a | b);
        // System.out.println(a ^ b);
        // System.out.println(~a);



        // int n = 1;
        // for(int i = 1; i <= 32; i++){
        //     n = n << 1;
        //     System.out.println(n);
        //     System.out.println();
        // }



        // int n = 100;
        // for(int i = 1; i <= 10; i++){
        //     n = n >> 1;
        //     System.out.println(n);
        //     System.out.println();
        // }



        // int n = 100;
        // for(int i = 1; i <= 10; i++){
        //     n = n >>> 1;
        //     System.out.println(n);
        //     System.out.println();
        // }



        // int n = 9;
        // if((n & 1) == 0){
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }



        // int n = 64;
        // if((n & (n - 1)) == 0){
        //     System.out.println("Power of 2");
        // } else {
        //     System.out.println("Not power of 2");
        // }



        int n = 5;
        int count = 0;
        while(n != 0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        System.out.println("Set bit count: " + count);



        // int a = 5;
        // int b = 6;
        
        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;

        // System.out.println("Value of a: " + a);
        // System.out.println("Value of b: " + b);



        // int arr[] = {10, 20, 30, 20, 10 ,30, 50, 60, 50, 60, 2};
        // System.out.println(10^20^30^20^10^30^50^60^50^60^2);

    }
}
