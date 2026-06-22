package Day_21;

import java.util.Scanner;

public class Q82 {
    public static void main(String[] args) {
        //Write a program to Reverse a string.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed String: " + rev);
    }
}
