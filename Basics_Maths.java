public class Basics_Maths {

    // Question No. 1 ->>>>>>>>>>>>>>> Print digits of a number
    static void printDigits(int num) {

         while(num != 0){
            int digit = num % 10;
            System.out.println(digit);
            num = num/10;

         }
    }

    // Question No. 2 ->>>>>>>>>>>>>>>>>> Count digits of a number
    static int countDigits(int num){
        int count = 0;
        while(num != 0){
            int digit = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }

    // Question No. 3 --->>>>>>>>>>>>>>>>>>> Sum of digits of a number
    static int sumOfDigits(int num){
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }

    // Question No. 4 --->>>>>>>>>>>>>>>> Reverse a number
    static int reverseDigits(int num){
        int revNum = 0;
         while(num != 0){
            int digit = num % 10;
            revNum = revNum*10+digit;
            num = num / 10;
         }
         return revNum;
    }

    // Question No. 5 ---->>>>>>>>>>>>>>>>>>>>>>> Palindrome Number
    static boolean isPalindrome(int num){
        int originalNum = num;
        int reversedNum = reverseDigits(num);
        if(originalNum == reversedNum){
            System.out.println("It is a palidrome");
            return true;
        }
        else{
            System.out.println("It is not a palidrome");
            return false;
        }
    }

    // Question No. 6 --->>>>>>>>>>>>>>>>>>>>>>>>>> Prime Number
    static boolean isPrimeOrNot(int num){
        for(int i=2; i<=num-1; i++){
            if(num%i == 0){
                System.out.println("It is not a prime number");
                return false;
            }
        }
        System.out.println("It is a prime number");
        return true;
    }

    // Question No. 7 --->>>>>>>>>>>>>>>> Greatest common divisor(GCD)
    static int getGCD(int a, int b){
        // gcd(a,b) = gcd(b, a%b);
        while(b != 0){
            int oldValueOfb = b;
            b = a%b;
            a = oldValueOfb;
        }
        // Jab mera b 0 hoga, tab a ki place par GCD mulega
        int ans = a;
        return ans;
    }

    // Question No. 8 --->>>>>>>>>>>>>>>> LCM
    static int getLCM(int a , int b) {
        int gcd = getGCD(a, b);
        // gcd(18,12) = 6
        int prod = a*b;
        // prod(a,b) -> 216
        int lcm = prod/gcd;
        // 216/6
        return lcm;
    }

    // Question No. 9 -->>>>>>>>>>>>>>> Armstrong Number
    static boolean isArmStrongNumber(int num){
        int sum = 0;
        int originalNum = num;
        while(num != 0){
            int digit = num % 10;
            int cubeOfDigit = digit*digit*digit;
            sum = sum + cubeOfDigit;
            num = num / 10;
        }
        if(sum == originalNum){
            return true;
        }
        else{
            return false;
        }
    }

    // Question No. 10 -->>>>>>>>>>>>>> Check Perfect Number
    static boolean checkPerfectNumber(int num) {
        int sum = 1;
        for(int i=2; i*i<=num; i++){
            if(num % i == 0){
                int firstFactor = i;
                int secondFactor = num/i;
                sum = sum + firstFactor + secondFactor;
            }
        }
        if(sum == num){
            return true;
        }
        else{
            return false;
        }
    }

    // Question No. 11 --->>>>>>>>>>>>>>>>>>>> Check all prime number 1 to n
    static void printAllPrimes(int n) {
        for(int num=2; num<=n; num++) {
            boolean isPrime = isPrimeOrNot(num);
            if(isPrime == true){
                System.out.println(num);
            }
        }
    }


   public static void main(String[]args){
        int num = 53127;


        printDigits(num);

        int ans = countDigits(num);
        System.out.println("Counted digits is: "+ans);

        int sum = sumOfDigits(num);
        System.out.println("Total sum digits is: "+sum);

        int revNum = reverseDigits(num);
        System.out.println(revNum);

        boolean ans1 = isPalindrome(1221);
        System.out.println(ans1);

        int num2 = 24;
        System.out.println(isPrimeOrNot(num2));

        System.out.println(getGCD(18,12));
        System.out.println(getLCM(18, 12));

        int num3 = 153;
        System.out.println(isArmStrongNumber(num3));

        printAllPrimes(24);
    }
}
