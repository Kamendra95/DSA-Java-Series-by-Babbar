import java.util.HashMap;

public class ArrayManipulationProblems_2 {



// 1. Reverse an Array    
    static void reverseArray(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k: arr){
            System.out.println(k);
        }
    }



// 2. Shift array elements by 1 position
    static void shiftBy1(int[] arr){
        // step 1: store last wale ki value
        int n = arr.length;
        int temp = arr[n-1];
        // step 2: shift all values of array
        for(int i = n - 1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        // step 3: temp ki value ko 0 index pr copy
        arr[0] = temp;
    }



// 3. Print Extreme Elements in an alternate manner
    static void printAlternate(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i <= j){
            if(i == j){
                System.out.println(arr[i]);
                return;
            } else {
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }



// 4. Find the mode of the array
    static int getMode(int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        // for(int i: freq.keySet()){
        //     System.out.println(i + " -> " + freq.get(i));
        // }

        int maxFreq = -1;
        int maxFreqWaliKey = -1;

        for(int key: freq.keySet()){
            int currentKey = key;
            int currentKeyKiFrequency = freq.get(key);
            if(currentKeyKiFrequency > maxFreq){
                maxFreq = currentKeyKiFrequency;
                maxFreqWaliKey = currentKey;
            }
        }
        return maxFreqWaliKey;
    }



// 5. Identify elements with highest and lowest frequency
    static int[] getHighestLowestFreqElement(int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for(int key: freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if(currentFreq > highestFreq){
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }
        int lowestfreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for(int key: freq.keySet()){
            int currentKey = key;
            int  currentFreq = freq.get(key);
            if(currentFreq < lowestfreq){
                lowestfreq = currentFreq;
                lowestNum = currentKey;
            }
        }
        int ans[] = {highestNum, lowestNum};
        return ans;
    }








    static void main(){
        // int arr[] = {1,2,3,4,5,6,7,8};
        // reverseArray(arr);



        // int arr[] = {1,2,3,4,5};
        // shiftBy1(arr);
        // for(int a: arr){
        //     System.out.print(a + " " );
        // }
        // System.out.println();



        // int arr[] = {1,2,3,4,5,6};
        // printAlternate(arr);



        // int arr[] = {1,1,1,1,3,3,3,3,2,2,2,5,4,4,5};
        // int ans = getMode(arr);
        // System.out.println(ans);



        int arr[] = {1,1,1,1,3,3,3,3,2,2,2,5,4,4,4,5};
        int ans[] = getHighestLowestFreqElement(arr);
        System.out.println("Highest freq wala num: " + ans[0]);
        System.out.println("lowest freq wala num: " + ans [1]);

        
    }
}
