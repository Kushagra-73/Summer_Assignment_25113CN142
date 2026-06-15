package Day_16;

import java.util.ArrayList;

public class Q64 {
    public static void main(String[] args) {
        //Write a program to Remove duplicates from array.
        int[] arr = {1, 1, 2, 2, 10};

        bubbleSort(arr);
        ArrayList<Integer> ans = removeDuplicates(arr);

        System.out.println(ans);
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

    static ArrayList<Integer> removeDuplicates(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i + 1]){
                ans.add(arr[i]);
            }

        }
        ans.add(arr[arr.length - 1]);
        return ans;

    }
}
