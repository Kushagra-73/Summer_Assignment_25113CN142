package Day_16;

import java.util.Scanner;

public class Q62 {
    public static void main(String[] args) {
        //Write a program to Find maximum frequency element.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array :");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at " + i + " index :");
            arr[i] = sc.nextInt();
        }

        int maxFreq = maxFrequency(arr);
        System.out.println("Max freq element is :" + maxFreq);


    }

    static int maxFrequency(int[] arr){
        int maxfreq = 0;
        int number = arr[0];
        for (int i = 0; i < arr.length - 1 ; i++) {
            int numfreq = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    numfreq++;
                }
            }
            if(numfreq > maxfreq){
                maxfreq = numfreq;
                number = arr[i];
            }
        }
        return number;
    }
}
