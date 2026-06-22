package Day_22;

import java.util.Scanner;

public class Q88 {
    public static void main(String[] args) {
        //Write a program to Remove spaces from
        //string.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }

        System.out.println("String without spaces: " + result);
    }
}
