package Day_15;

import java.util.Arrays;
import java.util.Scanner;

public class Q57 {
    public static void main(String[] args) {
        //Write a program to Reverse array.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array :");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at " + i + " index :");
            arr[i] = sc.nextInt();
        }

        System.out.println("Initial Array : " + Arrays.toString(arr));

        reverse(arr);
        System.out.println("Final Array : " + Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int i = 0, j = arr.length - 1;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
