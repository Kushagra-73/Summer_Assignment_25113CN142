package Day_24;

import java.util.Scanner;

public class Q93 {
    public static void main(String[] args) {
        //Write a program to Check string rotation.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String temp = str1 + str1;
        if (temp.contains(str2)) {
            System.out.println("String is a rotation");
        }
        else {
            System.out.println("String is not a rotation");
        }
    }
}
