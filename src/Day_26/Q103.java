package Day_26;

import java.util.Scanner;

public class Q103 {
    public static void main(String[] args) {
        // Write a program to Create ATM simulation.
        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("Enter your choice:");

        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Balance = " + balance);
            case 2 -> {
                System.out.print("Enter amount to deposit: ");
                int deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Updated Balance = " + balance);
            }
            case 3 ->{
                System.out.print("Enter amount to withdraw: ");
                int withdraw = sc.nextInt();
                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Updated Balance = " + balance);
                }
                else {
                    System.out.println("Insufficient Balance");
                }
            }
            default ->System.out.println("Invalid Choice");
        }
    }
}
