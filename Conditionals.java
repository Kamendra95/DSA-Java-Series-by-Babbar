import java.util.Scanner;

public class Conditionals {
    public static void main(String[]args){


        // // if Statement
        // int day = 5;
        // if(day == 5){
        //     System.out.println("Friday");
        // }


        // // if-else Statement
        // int age = 18;
        // if(age >= 18){
        //     System.out.println("You can eligible for voting");
        // }
        // else {
        //     System.out.println("You can not eligible for voting");
        // }


        // // if-else-if Ladder Conditional 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Eneter your days: ");
        // int days = sc.nextInt();

        // if(days == 1){
        //     System.out.println("Monday");
        // }

        // else if(days == 2){
        //     System.out.println("Tuesday");
        // }

        // else if(days == 3){
        //     System.out.println("Wednesday");
        // }

        // else if(days == 4){
        //     System.out.println("Thursday");
        // }

        // else if(days == 5){
        //     System.out.println("Friday");
        // }

        // else if(days == 6){
        //     System.out.println("Saturday");
        // }

        // else if(days == 7){
        //     System.out.println("Sunday");
        // }

        // else{
        //     System.out.println("Nothing else");
        // }


//         // Nested if-else
//             boolean hasSubscription = true;
//         int solvedProblems = 220;

//         if (hasSubscription) {

//             if (solvedProblems >= 200) {
//                 System.out.println("Unlock Advanced Sheet");
//             } else {
//                 System.out.println("Practice More Problems");
//             }

//         } else {
//             System.out.println("Upgrade to Premium");
//         }

//         int ages = 12;
//         char gender = 'M';

//         if(gender == 'M'){
//             System.out.println("You are a male");
//             if(ages > 18){
//                 System.out.println("you are male and ages> 18");
//             }
//             else{
//                 System.out.println("you are male and ages <= 18");
//             }
//         }
//         else{
//             System.out.println("You are not a male");
//             if(ages > 18){
//                 System.out.println("you are not male and ages > 18");
//             }
//             else{
//                 System.out.println("You are not male and ages <= 18");
//             }
//         }


//         // Ternary Operator 
//         int streakDays = 35;
//         String status = (streakDays >= 30) ? "Consistent" : "Irregular";
//         System.out.println(status);

//         int agee = 17;
//         String ans = (agee >= 18) ? "Eligible for voting" : "Not Eligible for voting";
//         System.out.println(ans);

// Witch Statement 
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value for day: ");
int day = sc.nextInt();

switch(day){
    
    case 1:
        System.out.println("Sunday");
        break;

        case 2:
            System.out.println("Monday");
            break;

            case 3:
                System.out.println("Tuesday");
                break;

                case 4:
                    System.out.println("wednsday");
                    break;

                    case 5:
                        System.out.println("Thursday");
                        break;

                        case 6:
                            System.out.println("Friday");
                            break;

                            case 7:
                                System.out.println("Saturday");
                                break;

                                default:
                                    System.out.println("Invalid day");
}
    }
}
