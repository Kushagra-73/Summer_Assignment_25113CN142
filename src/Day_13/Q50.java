package Day_13;

import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        //Write a program to Find sum and average of
        //array.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array :");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at " + i + " index :");
            arr[i] = sc.nextInt();
        }

        int sum = sum(arr);
        double average = average(arr);

        System.out.println("The sum of elements of array is " + sum + "\n The average of elements of array is =" + average);
    }

    static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    static double average(int[] arr){
        double avg = sum(arr) /(double)arr.length;
        return avg;
    }
}
