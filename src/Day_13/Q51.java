package Day_13;

import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        //Write a program to Find largest and smallest element.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array :");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at " + i + " index :");
            arr[i] = sc.nextInt();
        }

        int max = largest(arr);
        int min = smallest(arr);

        System.out.println("The largest element of the array is " + max + "\nThe smallest element of the array is " + min);

    }

    static int smallest(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }

    static int largest(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
}
