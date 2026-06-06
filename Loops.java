public class Loops {
    public static void main(String[]args){

        // for(int i = 0; i < 10; i++){
        //     System.out.println(i);
        // }


        // Nested Loop
        //  for(int i = 1; i <= 3; i++){
        //     for(int j = 1; j <= 3; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i <= 3; i++){
        //     for(int j = 1; j <= 3; j++){
        //         System.out.println(" i = " + i + " , j = " + j);
        //     }
        // }


        // //Break
        // for(int i = 1; i <= 10; i++){
        //     if(i == 5){
        //         break;
        //     }
        //     System.out.println(i);
        // }

        
        // // Continue
        // for(int i = 1; i <= 10; i++){
        //     if(i == 8 || i == 9 || i == 5){
        //         continue;
        //     }
        //     System.out.println(i);
        // }


        // // While Loop 
        //  int i = 1;
        //  while(i <= 5){
        //     System.out.println(i);
        //     i++;
        //  }

        // int i = 1;
        // while(i <= 2){
        //     int j = 1;
        //     while(j <= 3){
        //         System.out.println("i = " + i + ", j = " + j);
        //         j++;
        //     }
        //     i++;
        // }


        // Do While Loop
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while(i <= 5);
    }
}
