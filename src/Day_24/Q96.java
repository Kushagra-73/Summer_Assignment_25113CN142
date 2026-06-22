package Day_24;

import java.util.Scanner;

public class Q96 {
    public static void main(String[] args) {
        //Write a program to Remove duplicate
        //characters.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println("String after removing duplicates: " + result);
    }
}
