package Day_13;

import java.util.Scanner;

public class Q52 {
    public static void main(String[] args) {
        //Write a program to Count even and odd elements.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array :");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at " + i + " index :");
            arr[i] = sc.nextInt();
        }

        evenOdd(arr);
    }

    static void evenOdd(int[] arr){
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) continue;
            if(arr[i] % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Number of odd elements in array =" + odd + "\nNumber of even elements in array =" + even);
    }
}
