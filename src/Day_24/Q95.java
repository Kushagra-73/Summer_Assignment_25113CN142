package Day_24;

import java.util.Scanner;

public class Q95 {
    public static void main(String[] args) {
        //Write a program to Find longest word.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        String longest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
