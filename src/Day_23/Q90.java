package Day_23;

import java.util.Scanner;

public class Q90 {
    public static void main(String[] args) {
        //Write a program to Find first repeating
        //character.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("First repeating character: " + str.charAt(i));
                return;
            }
        }
        System.out.println("No repeating character found.");
    }

}
