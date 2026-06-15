package Day_17;

import java.util.Arrays;
import java.util.Scanner;

public class Q65 {
    public static void main(String[] args) {
        //Write a program to Merge arrays.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first array :");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements in the first array :");
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter element at " + i + " index :");
            arr1[i] = sc.nextInt();
        }
        System.out.println("First Array :" + Arrays.toString(arr1));

        System.out.println("Enter the length of second array :");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements in the second array :");
        for (int i = 0; i < n2; i++) {
            System.out.println("Enter element at " + i + " index :");
            arr2[i] = sc.nextInt();
        }
        System.out.println("Second Array :" + Arrays.toString(arr2));

        int[] mergeArray = mergeArrays(arr1, arr2);
        System.out.println("Merged Array :" + Arrays.toString(mergeArray));

    }

    static int[] mergeArrays(int[] arr1, int[] arr2){
        int mergeLength = arr1.length + arr2.length;
        int[] merge = new int[mergeLength];
        int k = 0;
        for (int i = 0; i < mergeLength; i++) {
            if(i < arr1.length){
                merge[i] = arr1[i];
            }
            else{
                merge[i] = arr2[k++];
            }
        }
        return merge;
    }
}
