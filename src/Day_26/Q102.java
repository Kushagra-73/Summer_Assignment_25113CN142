package Day_26;

import java.util.Scanner;

public class Q102 {
    public static void main(String[] args) {
        // Write a program to Create voting eligibility system.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        if(age < 0){
            System.out.println("Enter the correct age :");
        }
        else{
            if(age < 18){
                System.out.println("You are not eligible to vote");
            }
            else{
                System.out.println("You are eligible to vote");
            }
        }

    }
}
