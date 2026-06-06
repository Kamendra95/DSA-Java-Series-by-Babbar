public class DataTypes {
    public static void main(String[]args){

        // Numeric DTs - byte, short, int, long
        byte num1 = 127;
        System.out.println(num1);

        short num2 = 32767;
        System.out.println(num2);

        int num3 = 500000000;
        System.out.println(num3);

        long num4 = 329421370;
        System.out.println(num4);

        // Floating DTs 
        float num5 = 3.142436f;
        System.out.println(num5);

        double num6 = 3.145698723658;
        System.out.println(num6);

        // Others - Char, Boolean 
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);

        char firstCharacter = 'K';
        System.out.println("My First Character is: " + firstCharacter);

        // TypeCasting 
        long newNum = num1;
        System.out.println("new Num: " + newNum);
        System.out.println(num1);

        long value1 = 1234567899;
        int value2 = (int)value1;
        System.out.println(value2);
    }
}