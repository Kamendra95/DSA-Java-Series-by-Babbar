public class Operators{
    public static void main(String[]args){


        // Arthemetic operator 
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int projected = solvedThisWeek * 4;
        int average = solvedThisWeek / 7;
        int remainder = solvedThisWeek % 7;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);


        // Relational operator
        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak);
        System.out.println(currentStreak != targetStreak);
        System.out.println(currentStreak > targetStreak);
        System.out.println(currentStreak < targetStreak);
        System.out.println(currentStreak >= targetStreak);
        System.out.println(currentStreak <= targetStreak);


        // Logical Operators 
        boolean completedDSA = true;
        boolean completedCore = false;

        System.out.println(completedDSA && completedCore);
        System.out.println(completedDSA || completedCore);
        System.out.println(!completedCore);


        // Assignment Operators 
        int ratingPoints = 100;

        ratingPoints += 20;  // ratingPoints = ratingPoints + 20
        System.out.println(ratingPoints); // 100+20 = 120
        ratingPoints -= 10;  // ratingPoints = ratingPoints - 10
        System.out.println(ratingPoints); // 120-10 = 110
        ratingPoints *= 2;   // ratingPoints = ratingPoints * 2
        System.out.println(ratingPoints); // 110*2 = 220
        ratingPoints /= 4;   // ratingPoints = ratingPoints / 4
        System.out.println(ratingPoints); // 220/4 = 55
        ratingPoints %= 30;  // ratingPoints = ratingPoints % 30
        System.out.println(ratingPoints); // 55%30 = 25

        
        // Unary Operators 
        int activeUsers = 100;

        int prefix = ++activeUsers;
        int postfix = activeUsers++;

        System.out.println(prefix);
        System.out.println(postfix);
        System.out.println(activeUsers);

    }
}
