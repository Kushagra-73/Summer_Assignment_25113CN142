package Day_29;

import java.util.Scanner;

public class Q115 {
    public static void main(String[] args) {
        // Write a program to Create menu-driven string operations system.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        while (true) {
            System.out.println("\n Menu-Driven String Operations ");
            System.out.println("1. Display String");
            System.out.println("2. Find Length");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Convert to Lowercase");
            System.out.println("5. Reverse String");
            System.out.println("6. Check Palindrome");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("String: " + str);
                    break;
                case 2:
                    System.out.println("Length = " + str.length());
                    break;
                case 3:
                    System.out.println("Uppercase: " + str.toUpperCase());
                    break;
                case 4:
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;
                case 5:
                    String reverse = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reverse += str.charAt(i);
                    }
                    System.out.println("Reversed String: " + reverse);
                    break;
                case 6:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }
                    if (str.equalsIgnoreCase(rev)) {
                        System.out.println("The string is a Palindrome.");
                    }
                    else {
                        System.out.println("The string is not a Palindrome.");
                    }
                    break;
                case 7:
                    System.out.println("Thank you for using String Operations System.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
