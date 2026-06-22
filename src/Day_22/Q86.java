package Day_22;

import java.util.Scanner;

public class Q86 {
    public static void main(String[] args) {
        //Write a program to Count words in a
        //sentence.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Number of words = " + count);
    }
}
