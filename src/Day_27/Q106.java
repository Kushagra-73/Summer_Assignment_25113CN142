package Day_27;

import java.util.Scanner;

public class Q106 {
    public static void main(String[] args) {
        // Write a program to Create employee management system.

        Scanner sc = new Scanner(System.in);

        int empId = 101;
        String name = "Rahul";
        String department = "IT";
        double salary = 50000;

        System.out.println("===== Employee Management System =====");
        System.out.println("1. View Employee Details");
        System.out.println("2. Update Salary");
        System.out.println("3. Update Department");
        System.out.println("4. Update Employee Name");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1 -> {
                System.out.println("\nEmployee ID : " + empId);
                System.out.println("Employee Name : " + name);
                System.out.println("Department : " + department);
                System.out.println("Salary : " + salary);
            }

            case 2 -> {
                System.out.print("Enter New Salary: ");
                salary = sc.nextDouble();
                System.out.println("Salary Updated Successfully!");
            }

            case 3 -> {
                System.out.print("Enter New Department: ");
                department = sc.next();
                System.out.println("Department Updated Successfully!");
            }

            case 4 -> {
                System.out.print("Enter New Employee Name: ");
                name = sc.next();
                System.out.println("Name Updated Successfully!");
            }

            case 5 -> {
                System.out.println("Thank You!");
            }

            default -> {
                System.out.println("Invalid Choice");
            }
        }

        if (choice != 5) {
            System.out.println("\nUpdated Employee Details:");
            System.out.println("Employee ID : " + empId);
            System.out.println("Employee Name : " + name);
            System.out.println("Department : " + department);
            System.out.println("Salary : " + salary);
        }
    }
}
