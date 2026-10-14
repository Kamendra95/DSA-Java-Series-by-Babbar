public class ArrayProblemSolvingPart_1 {



// Find the average of array elements
    public static double getAverage(int[] arr ){
        double sum = 0;
        for(int i : arr){
            sum += i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }



// Multiply each element of array by 10
    static int[] multiplyBy10(int[] arr){
        int size = arr.length;
        int newArray[] = new int[size];

        for(int i=0; i<size; i++){
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        return newArray;
    }    



// Search for an element in an Array {Linear Search}
     static boolean findTarget(int arr[], int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        // agar pura array tarvel ho chuka hai 
        // and ek baar bhi target nahi mila 
        // iska matlab, target is not present in array
        // return false
        return false;
     }







    public static void main(String []args){
        // int[] arr = {2, 4, 1, 3};
        // System.out.println(getAverage(arr));



        // int arr[] = {1, 2, 3, 4, 5};
        // int ans[] = multiplyBy10(arr);
        // System.out.println("printing ans array: ");
        // for(int i:ans){
        //     System.out.println(i);
        // }



        int arr[] = {1, 2, 3, 4, 7, 9};
        boolean ans = findTarget(arr, 9);
        System.out.println(ans);


           
    }
}





