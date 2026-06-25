package Day_27;

import java.util.Scanner;

public class Q107 {
    public static void main(String[] args) {
        //  Write a program to Create salary management system.

        Scanner sc = new Scanner(System.in);

        String name = "Rahul";
        double basicSalary = 50000;
        double bonus = 5000;
        double deduction = 2000;

        System.out.println("Salary Management System");
        System.out.println("1. View Salary Details");
        System.out.println("2. Update Basic Salary");
        System.out.println("3. Add Bonus");
        System.out.println("4. Add Deduction");
        System.out.println("5. Calculate Net Salary");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Employee Name : " + name);
                System.out.println("Basic Salary : " + basicSalary);
                System.out.println("Bonus : " + bonus);
                System.out.println("Deduction : " + deduction);
            }
            case 2 -> {
                System.out.print("Enter New Basic Salary: ");
                basicSalary = sc.nextDouble();
                System.out.println("Salary Updated Successfully!");
            }
            case 3 -> {
                System.out.print("Enter Bonus Amount: ");
                bonus = sc.nextDouble();
                System.out.println("Bonus Added Successfully!");
            }
            case 4 -> {
                System.out.print("Enter Deduction Amount: ");
                deduction = sc.nextDouble();
                System.out.println("Deduction Added Successfully!");
            }
            case 5 -> {
                double netSalary = basicSalary + bonus - deduction;
                System.out.println("Net Salary = " + netSalary);
            }
            case 6 -> System.out.println("Thank You!");
            default -> System.out.println("Invalid Choice");
        }
    }
}
