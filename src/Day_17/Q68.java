package Day_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q68 {
    public static void main(String[] args) {
        //Write a program to common elements of arrays.
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

        ArrayList<Integer> ans = common(arr1, arr2);
        System.out.println("The common in array are :" + ans) ;
    }


    static ArrayList<Integer> common(int[] arr1, int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    if(!ans.contains(arr1[i])) {
                        ans.add(arr1[i]);
                    }
                }
            }
        }

        return ans;
    }
}

