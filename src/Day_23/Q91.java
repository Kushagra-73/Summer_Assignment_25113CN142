package Day_23;

import java.util.Arrays;
import java.util.Scanner;

public class Q91 {
    public static void main(String[] args) {
        //Write a program to Check anagram strings.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram Strings");
        }
        else {
            System.out.println("Not Anagram Strings");
        }
    }
}
