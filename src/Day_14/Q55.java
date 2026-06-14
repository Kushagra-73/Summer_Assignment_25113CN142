package Day_14;

import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        // Second largest element;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array :");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at " + i + " index :");
            arr[i] = sc.nextInt();
        }

        int Smax = secondLargest(arr);
        System.out.println("The second largest element in the array is :" + Smax);
    }

    static int secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int smax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                smax = max;
                max = arr[i];
            } else if (smax < arr[i] && smax !=  max) {
                smax = arr[i];
            }
        }
        return smax;

    }
}
