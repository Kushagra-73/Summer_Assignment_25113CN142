package Day_30;

import java.util.Scanner;

public class Q119 {
    public static void main(String[] args) {
        // Write a program to Create mini employee management system.

        Scanner sc = new Scanner(System.in);

        String[] employeeNames = new String[100];
        String[] employeeIds = new String[100];
        double[] salaries = new double[100];
        int count = 0;

        while (true) {
            System.out.println("\nMini Employee Management System ");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Update Salary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < 100) {
                        System.out.print("Enter Employee Name: ");
                        employeeNames[count] = sc.nextLine();

                        System.out.print("Enter Employee ID: ");
                        employeeIds[count] = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        salaries[count] = sc.nextDouble();
                        sc.nextLine();

                        count++;
                        System.out.println("Employee added successfully.");
                    }
                    else {
                        System.out.println("Employee records are full.");
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No employee records available.");
                    }
                    else {
                        System.out.println("\n----- Employee Records -----");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". Name : " + employeeNames[i]);
                            System.out.println("   ID : " + employeeIds[i]);
                            System.out.println("   Salary : ₹" + salaries[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (employeeIds[i].equalsIgnoreCase(search)) {
                            System.out.println("Employee Found:");
                            System.out.println("Name : " + employeeNames[i]);
                            System.out.println("ID : " + employeeIds[i]);
                            System.out.println("Salary : ₹" + salaries[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Employee ID to Delete: ");
                    String delete = sc.nextLine();
                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {
                        if (employeeIds[i].equalsIgnoreCase(delete)) {
                            for (int j = i; j < count - 1; j++) {
                                employeeNames[j] = employeeNames[j + 1];
                                employeeIds[j] = employeeIds[j + 1];
                                salaries[j] = salaries[j + 1];
                            }

                            count--;
                            deleted = true;
                            System.out.println("Employee deleted successfully.");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Employee ID to Update Salary: ");
                    String update = sc.nextLine();
                    boolean updated = false;

                    for (int i = 0; i < count; i++) {
                        if (employeeIds[i].equalsIgnoreCase(update)) {
                            System.out.print("Enter New Salary: ");
                            salaries[i] = sc.nextDouble();
                            updated = true;
                            System.out.println("Salary updated successfully.");
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 6:
                    System.out.println("Thank you for using Mini Employee Management System.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
