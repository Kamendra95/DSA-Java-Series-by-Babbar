import java.util.Scanner;

public class Arrays {
      public static void main(String[]args){
        // // Declaration
        // int arr [];

        // // Allocation
        // arr = new int [3];

        // // Initialisation
        // int brr[] = {23, 45, 67};
        // for(int val : brr){
        //     System.out.println(val);
        // }

        // int n = brr.length;
        // for(int index = 0; index <= n-1; index++){
        //     System.out.println(brr[index]);
        // }

        // System.out.println("Value at 0 index : " + brr[0]);
        // System.out.println("Value at 1 index : " + brr[1]);
        // System.out.println("Value at 2 index : " + brr[2]);


// // Taking input in an Array         
//         int arr[] = new int[5];
//         Scanner sc = new Scanner(System.in);
//         int n = arr.length;
//         // Input 
//         for(int i = 0; i <= n-1; i++){
//             System.out.print("Provide input for index: " + i + " = ");
//             arr[i] = sc.nextInt();
//         }

//         // Output
//         System.out.println("You array contains: ");
//         for(int val: arr){
//             System.out.println(val);
//         }


// //Question No. 1 -> Adding Array(Sum)
//         int arr[] = {10, 20, 30 ,40 ,60};
//         int sum = 0;
//         int n = arr.length;

//         for(int i = 0; i <= n-1; i++){
//             int value = arr[i];
//             sum = sum + value;
//         }
//         System.out.println(sum);


// // Question No. 2 --> Multiplication Array(*)
//         int arr[] = {2,7,8,9,6,5};
//         int MP = 1;
//         int n = arr.length;

//         for(int i=0; i<=n-1; i++){
//             int value = arr[i];
//             MP = MP * value;
//         }
//         System.out.println(MP);


// // Question No. 3 --> Find max element in Array
//         int arr[] = {2,5,-8,7};
//         int n = arr.length;
//         int maxValue = arr[0];

//         // Compare maxValue ko array ke har element ke sath
//         for(int i=0; i<=n-1; i++){
//             if(arr[i] > maxValue){
//                 maxValue = arr[i];
//             }
//         }
//         System.out.println("The maximum value is: "+maxValue);
        
        
// // Question No. 4 --> Find Minimum element in Array
//         int arr[] = {2,4,5,-3,8};
//         int n = arr.length;
//         int minValue = arr[0];

//         // Compare minValue ko array ke har element ke sath
//         for(int i = 0; i <= n-1; i++){
//             if(arr[i] < minValue){
//                 minValue = arr[i];
//             }
//         }
//         System.out.println("The Minimum Value is: " +minValue);





// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 2D Array <<<<<<<<<<<<<<<<<<<<<<<<<<
        // // Declaration
        // int arr [][];
        
        // // Allocation
        // arr = new int[2][3];

        // // Initialisation
        // int[][] brr = {
        //     {1,2},
        //     {2,3},
        //     {3,4},
        //     {4,5}
        // };
        // // System.out.println(brr[0][1]);

        // int rowLength = brr.length;
        // int colLength = brr[0].length;

        // for(int rowIndex = 0; rowIndex <= rowLength-1; rowIndex++){
        //     for(int colIndex = 0; colIndex <= colLength-1; colIndex++){
        //         System.out.print(brr[rowIndex][colIndex] + " ");
        //     }
        //     System.out.println();
        // }


        int [][] arr = {
            {3,4},
            {5,6,7,8,},
            {3,4,5},
            {3}
        };
        int rowLength = arr.length;

        for(int rowIndex=0; rowIndex<=rowLength-1; rowIndex++){
            int colLength = arr[rowIndex].length;

            for(int colIndex=0; colIndex <= colLength-1; colIndex++){
                System.out.print(arr[rowIndex][colIndex] + " ");
            }
            
            System.out.println();
        }
    }
}
