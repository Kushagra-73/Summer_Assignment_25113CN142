package Day_28;

import java.util.Scanner;

public class Q110 {
    public static void main(String[] args) {
        // Write a program to Create bank account system.

        Scanner sc = new Scanner(System.in);
        String accountHolder = "Rahul";
        int accountNumber = 123456;
        double balance = 50000;

        System.out.println("Bank Account System ");
        System.out.println("1. View Account Details");
        System.out.println("2. Check Balance");
        System.out.println("3. Deposit Money");
        System.out.println("4. Withdraw Money");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Account Holder : " + accountHolder);
                System.out.println("Account Number : " + accountNumber);
                System.out.println("Balance : " + balance);
            }
            case 2 -> {
                System.out.println("Current Balance : " + balance);
            }
            case 3 -> {
                System.out.print("Enter Amount to Deposit: ");
                double deposit = sc.nextDouble();
                balance = balance + deposit;
                System.out.println("Deposit Successful!");
                System.out.println("Updated Balance : " + balance);
            }
            case 4 -> {
                System.out.print("Enter Amount to Withdraw: ");
                double withdraw = sc.nextDouble();
                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Withdrawal Successful!");
                    System.out.println("Remaining Balance : " + balance);
                }
                else System.out.println("Insufficient Balance!");
            }
            case 5 -> System.out.println("Thank You!");
            default -> System.out.println("Invalid Choice");
        }
    }
}
