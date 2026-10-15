public class ArrayProblemSolvingPart_1 {



// 1. Find the average of array elements
    public static double getAverage(int[] arr ){
        double sum = 0;
        for(int i : arr){
            sum += i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }



// 2. Multiply each element of array by 10
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



// 3. Search for an element in an Array {Linear Search}
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



// 4. Find the maximum element in an array
     static int getMaximum(int arr[]){
        int maxi = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        return maxi;
     }



// 5. Return Sum of +ve and -ve numbers
     static int[] getPosNegSum(int arr[]){
        int posSum = 0;
        int negSum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                posSum = posSum + arr[i];
            } else {
                negSum = negSum + arr[i];
            }
        }
        int ans[] = {posSum, negSum};
        return ans;
     }



// 6. Count the number od zeroes and ones
     static int[] getZeroOneCount(int arr[]){
        int zeroCount = 0;
        int oneCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zeroCount++;
            } else {
                oneCount++;
            }
        }
        int ans[] = {zeroCount, oneCount};
        return ans;
     }



// 7. Find first Unsorted Element in Array
     static int getUnsortedElement(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i+1] <= arr[i]){
                return arr[i+1];
            }
        }
        return -1;
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



        // int arr[] = {1, 2, 3, 4, 7, 9};
        // boolean ans = findTarget(arr, 9);
        // System.out.println(ans);


           
        // int arr[] = {1, 4, 7, 38, 95, 90};
        // System.out.println(getMaximum(arr));



        // int arr[] = {-1, -8, -9, 9, 8 , 6, 5, -5};
        // int ans[] = getPosNegSum(arr);
        // System.out.println("Positive Sum: " + ans[0]);
        // System.out.println("Negative Sum: " + ans[1]);



        // int arr[] = {0,1,0,0,0,1,1,0,1,1};
        // int ans[] = getZeroOneCount(arr);
        // System.out.println("Count of Zero number: " + ans[0]);
        // System.out.println("Count of One number: " + ans[1]);



        int arr[] = {1,3,5,2,8};
        System.out.println(getUnsortedElement(arr));
    }
}





