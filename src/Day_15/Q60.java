package Day_15;

import java.util.Arrays;

public class Q60 {
    public static void main(String[] args) {
        //Write a program to Move zeroes to end.
        int[] arr = {0, 5, 0, -3, 7};

        System.out.println("Initial Array : " + Arrays.toString(arr));

        moveZerosToEnd(arr);
        System.out.println("Final Array : " + Arrays.toString(arr));
    }
    static void moveZerosToEnd(int[] arr){
        int i = 0, j = arr.length - 1;
        while (i <= j){
            if(arr[j] == 0){
                j--;
            } else if (arr[i] != 0) {
                i++;
            } else if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
}
