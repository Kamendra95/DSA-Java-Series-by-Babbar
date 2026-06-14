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


        // int [][] arr = {
        //     {3,4},
        //     {5,6,7,8,},
        //     {3,4,5},
        //     {3}
        // };
        // int rowLength = arr.length;

        // // for(int rowIndex=0; rowIndex<=rowLength-1; rowIndex++){
        // //     int colLength = arr[rowIndex].length;

        // //     for(int colIndex=0; colIndex <= colLength-1; colIndex++){
        // //         System.out.print(arr[rowIndex][colIndex] + " ");
        // //     }
            
        // //     System.out.println();
        // // }

        // // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>Traversal 2-D Array (This is for all type, 2-D Array)
        // for(int rowIndex = 0; rowIndex<=arr.length-1; rowIndex++){
        //     for(int colIndex=0; colIndex<=arr[rowIndex].length-1; colIndex++){
        //         System.out.print(arr[rowIndex][colIndex] + " ");
        //     }
        //     System.out.println();
        // }


     // //>>>>>>>>>>>>>>>>>>>>>>>>> Taking input in 2-D Array
        // int arr[][] = new int[3][4];
        // Scanner sc = new Scanner(System.in);
        // // Input
        // for(int i=0; i<=arr.length-1; i++){
        //     for(int j=0; j<=arr[i].length-1; j++){
        //         System.out.print("Provide value for row = " + i + " and column = " + j +" : ");
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // // Print
        // for(int rowIndex=0; rowIndex<=arr.length-1; rowIndex++){
        //     for(int colIndex=0; colIndex<=arr[rowIndex].length-1; colIndex++){
        //         System.out.print(arr[rowIndex][colIndex] + " ");
        //     }
        //     System.out.println();
        // }


     // // Question no. 1 --> >>>>>>>>>>>>>>>>>>>>>>>>>>>> Adding Array (SUM)
        // int arr[][] = {{1,2,3}, {1,2,3}};
        // int sum = 0;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[i].length; j++){
        //         int value = arr[i][j];
        //         sum = sum + value;
        //     }
        // }
        // System.out.println(sum);



    // // Question no. 2 -->>>>>>>>>>>>>>>>>>>>>>>>>>>> Multiplication (*)
        // int arr[][] = {{1,2,3,},{1,2,3}};
        // int Multiplication = 1;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[i].length; j++){
        //         int value = arr[i][j];
        //         Multiplication = Multiplication * value;
        //     }
        // }
        //  System.out.println(Multiplication);


        
    // Question no. 3 -->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Find maxValue
        //   int arr[][] = {{33,44,22},{14,25,36}};
        //   int maxValue = arr[0][0];
        //   for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[i].length; j++){
        //         if(arr[i][j] > maxValue){
        //             // Update maxValue
        //             maxValue = arr[i][j];
        //         }
        //     }
        //   }
        //   System.out.println(maxValue);



    // Question no. 4 -->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Find minValue 
          int arr[][] = {{23,56,1,4,}, {5,9,85,-5}};
          int minValue = arr[0][0];
          for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] < minValue){
                    // Update minValue
                    minValue = arr[i][j];
                }
            }
          }
          System.out.println(minValue);
    }
}
