package Day_27;

import java.util.Scanner;

public class Q105 {
    static void main(String[] args) {
        // Write a program to Create student record management system.

        Scanner sc = new Scanner(System.in);
        int rollNo = 101;
        String name = "Rahul";
        int marks = 85;

        System.out.println("1. View Student Record");
        System.out.println("2. Update Marks");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Roll No: " + rollNo);
                System.out.println("Name: " + name);
                System.out.println("Marks: " + marks);
            }
            case 2 -> {
                System.out.print("Enter new marks: ");
                marks = sc.nextInt();
                System.out.println("Marks Updated Successfully!");
                System.out.println("New Marks: " + marks);
            }
            case 3 -> System.out.println("Thank You!");
            default -> System.out.println("Invalid Choice");
        }
    }
}
