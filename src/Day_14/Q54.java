package Day_14;

import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        //Write a program to Frequency of an element.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array :");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at " + i + " index :");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to get :");
        int target = sc.nextInt();

        int frequency = frequency(arr, target);
        System.out.println(frequency);
    }

    static int frequency(int[] arr, int element){
        int ans = 0;
        for (int i = 0; i < arr.length - 1 ; i++) {
            if(arr[i] == element) ans++;
        }
        return ans;
    }
}
