package Day_15;

import java.util.Arrays;
import java.util.Scanner;

public class Q58 {
    public static void main(String[] args) {
        //Write a program to Rotate array left.
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

        rotateLeft(arr, 0, arr.length - 1);
        rotateLeft(arr, 0, arr.length - 2);
        System.out.println("Final Array : " + Arrays.toString(arr));
    }

    static void rotateLeft(int[] arr, int start, int end){
        int i = start, j = end;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
