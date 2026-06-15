package Day_18;

import java.util.Arrays;
import java.util.Scanner;

public class Q70 {
    public static void main(String[] args) {
        //Write a program to Selection sort.

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

        selectionSort(arr);
        System.out.println("Final Array : " + Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int key = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[key]) {
                    key = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[key];
            arr[key] = temp;
        }
    }
}
