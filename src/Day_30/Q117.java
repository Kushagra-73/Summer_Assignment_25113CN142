package Day_30;

import java.util.Scanner;

public class Q117 {
    public static void main(String[] args) {
        // Write a program to Create student record system using arrays and strings.

        Scanner sc = new Scanner(System.in);

        String[] names = new String[100];
        String[] rolls = new String[100];
        double[] marks = new double[100];
        int count = 0;

        while (true) {
            System.out.println("\n===== Student Record System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Marks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    if (count < 100) {
                        System.out.print("Enter Student Name: ");
                        names[count] = sc.nextLine();
                        System.out.print("Enter Roll Number: ");
                        rolls[count] = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        marks[count] = sc.nextDouble();
                        sc.nextLine();

                        count++;
                        System.out.println("Student added successfully.");
                    }
                    else {
                        System.out.println("Record is full.");
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No student records available.");
                    }
                    else {
                        System.out.println("\n----- Student Records -----");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". Name : " + names[i]);
                            System.out.println("   Roll No : " + rolls[i]);
                            System.out.println("   Marks : " + marks[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (rolls[i].equalsIgnoreCase(search)) {
                            System.out.println("Student Found:");
                            System.out.println("Name : " + names[i]);
                            System.out.println("Roll No : " + rolls[i]);
                            System.out.println("Marks : " + marks[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Roll Number to Delete: ");
                    String delete = sc.nextLine();
                    boolean deleted = false;
                    for (int i = 0; i < count; i++) {
                        if (rolls[i].equalsIgnoreCase(delete)) {
                            for (int j = i; j < count - 1; j++) {
                                names[j] = names[j + 1];
                                rolls[j] = rolls[j + 1];
                                marks[j] = marks[j + 1];
                            }

                            count--;
                            deleted = true;
                            System.out.println("Student record deleted successfully.");
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Roll Number to Update Marks: ");
                    String update = sc.nextLine();
                    boolean updated = false;
                    for (int i = 0; i < count; i++) {
                        if (rolls[i].equalsIgnoreCase(update)) {
                            System.out.print("Enter New Marks: ");
                            marks[i] = sc.nextDouble();
                            updated = true;
                            System.out.println("Marks updated successfully.");
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Student not found.");
                    }
                    break;
                case 6:
                    System.out.println("Thank you for using Student Record System.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
