package Day_16;

import java.util.Arrays;

public class Q63 {
    public static void main(String[] args) {
        //Write a program to Find pair with given sum.

        int[] arr = {2, 11, 7, 15};
        int target = 9;

        bubbleSort(arr);

        int[] ans = sumPair(arr,target);

        System.out.println("Pair :" + Arrays.toString(ans));

    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    static int[] sumPair(int[] arr, int target){
        int[] ans = {0,0};
        int i = 0;
        int j = arr.length - 1;

        while (i < j){
            if(arr[i] + arr[j] == target){
                ans[0] = arr[i];
                ans[1] = arr[j];
                break;
            } else if (arr[i] + arr[j] < target){
                i++;
            }
            else{
                j--;
            }
        }

        return ans;
    }
}
