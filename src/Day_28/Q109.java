package Day_28;

import java.util.Scanner;

public class Q109 {
    public static void main(String[] args) {
        // Write a program to Create library management system.

        Scanner sc = new Scanner(System.in);
        int bookId = 101;
        String bookName = "The Plague";
        String author = "Albert Camus";
        boolean issued = false;

        System.out.println(" Library Management System ");
        System.out.println("1. View Novel Details");
        System.out.println("2. Issue Novel");
        System.out.println("3. Return Novel");
        System.out.println("4. Update Novel Name");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Book ID : " + bookId);
                System.out.println("Novel Name : " + bookName);
                System.out.println("Author : " + author);
                System.out.println("Status : " + (issued ? "Issued" : "Available"));
            }
            case 2 -> {
                if (!issued) {
                    issued = true;
                    System.out.println("Novel Issued Successfully!");
                } else System.out.println("Novel is Already Issued!");
            }
            case 3 -> {
                if (issued) {
                    issued = false;
                    System.out.println("Novel Returned Successfully!");
                }
                else System.out.println("Novel is Already Available!");
            }
            case 4 -> {
                sc.nextLine();
                System.out.print("Enter New Novel Name: ");
                bookName = sc.nextLine();
                System.out.println("Novel Name Updated Successfully!");
            }
            case 5 -> System.out.println("Thank You!");
            default ->System.out.println("Invalid Choice");

        }
    }
}
