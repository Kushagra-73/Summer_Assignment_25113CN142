package Day_22;

import java.util.Scanner;

public class Q85 {
    public static void main(String[] args) {
        //Write a program to Check palindrome string.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome String");
        }
        else {
            System.out.println("Not a Palindrome String");
        }
    }
}
