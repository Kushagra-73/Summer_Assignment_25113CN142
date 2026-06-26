package Day_28;

import java.util.Scanner;

public class Q112 {
    public static void main(String[] args) {
//        Write a program to Create contact management system.
        Scanner sc = new Scanner(System.in);

        String[] names = new String[100];
        String[] phones = new String[100];
        int count = 0;
        while (true) {
            System.out.println("\n Contact Management System ");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    if (count < 100) {
                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();
                        System.out.print("Enter Phone Number: ");
                        phones[count] = sc.nextLine();
                        count++;
                        System.out.println("Contact added successfully.");
                    }
                    else {
                        System.out.println("Contact list is full.");
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No contacts available.");
                    }
                    else {
                        System.out.println("\nContact List ");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + names[i] + " - " + phones[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(search)) {
                            System.out.println("Contact Found:");
                            System.out.println("Name: " + names[i]);
                            System.out.println("Phone: " + phones[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Name to Delete: ");
                    String delete = sc.nextLine();
                    boolean deleted = false;
                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(delete)) {
                            for (int j = i; j < count - 1; j++) {
                                names[j] = names[j + 1];
                                phones[j] = phones[j + 1];
                            }
                            count--;
                            deleted = true;
                            System.out.println("Contact deleted successfully.");
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using Contact Management System.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }

    }
}
