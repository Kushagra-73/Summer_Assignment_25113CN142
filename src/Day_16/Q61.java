package Day_16;

public class Q61 {
    public static void main(String[] args) {
        //Write a program to Find missing number in array.

        int[] arr = {8, 2, 1, 4, 6, 7, 3, 9};
        int missingNum = missingNumber(arr);
        System.out.println("The missing number is : " + missingNum);
    }

    static int sum(int[] arr){
        int n = arr[arr.length-1];
        return ((n * (n+1)) / 2);
    }

    static int missingNumber(int[] arr){
        int reqSum = sum(arr);
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum+=arr[i];
        }
        int differnce = reqSum - arraySum;
        if(differnce == 0) return arr[arr.length - 1] + 1;
        return differnce;
    }
}
