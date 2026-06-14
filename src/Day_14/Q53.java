package Day_14;

import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
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

        int search = LinearSerch(arr, target);

        if(search != -1){
            System.out.println("The element is at the index :" + search);
        }
        else {
            System.out.println("Element not found ");
        }

    }

    static int LinearSerch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == target){
                    return i;
                }
            }
        }
        return -1;
    }
}
