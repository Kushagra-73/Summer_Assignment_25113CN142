package Day_30;

import java.util.Scanner;

public class Q118 {
    public static void main(String[] args) {
        // Write a program to Create mini library system.

        Scanner sc = new Scanner(System.in);

        String[] books = new String[100];
        String[] authors = new String[100];
        boolean[] issued = new boolean[100];
        int count = 0;

        while (true) {
            System.out.println("\n Mini Library System ");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < 100) {
                        System.out.print("Enter Book Name: ");
                        books[count] = sc.nextLine();
                        System.out.print("Enter Author Name: ");
                        authors[count] = sc.nextLine();
                        issued[count] = false;
                        count++;
                        System.out.println("Book added successfully.");
                    }
                    else {
                        System.out.println("Library is full.");
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No books available.");
                    }
                    else {
                        System.out.println("\n Book List ");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". Book : " + books[i]);
                            System.out.println("   Author : " + authors[i]);
                            System.out.println("   Status : " + (issued[i] ? "Issued" : "Available"));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Book Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (books[i].equalsIgnoreCase(search)) {
                            System.out.println("Book Found:");
                            System.out.println("Book : " + books[i]);
                            System.out.println("Author : " + authors[i]);
                            System.out.println("Status : " + (issued[i] ? "Issued" : "Available"));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Book Name to Issue: ");
                    String issue = sc.nextLine();
                    boolean issuedBook = false;
                    for (int i = 0; i < count; i++) {
                        if (books[i].equalsIgnoreCase(issue)) {
                            if (!issued[i]) {
                                issued[i] = true;
                                System.out.println("Book issued successfully.");
                            }
                            else {
                                System.out.println("Book is already issued.");
                            }
                            issuedBook = true;
                            break;
                        }
                    }
                    if (!issuedBook) {
                        System.out.println("Book not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Book Name to Return: ");
                    String returned = sc.nextLine();
                    boolean returnBook = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].equalsIgnoreCase(returned)) {
                            if (issued[i]) {
                                issued[i] = false;
                                System.out.println("Book returned successfully.");
                            }
                            else {
                                System.out.println("Book was not issued.");
                            }
                            returnBook = true;
                            break;
                        }
                    }
                    if (!returnBook) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using Mini Library System.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
