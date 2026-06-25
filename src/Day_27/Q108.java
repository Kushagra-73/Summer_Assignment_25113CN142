package Day_27;

import java.util.Scanner;

public class Q108 {
    public static void main(String[] args) {
        // Write a program to Create marksheet generation system.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks in English: ");
        int english = sc.nextInt();
        System.out.print("Enter Marks in Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter Marks in Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter Marks in Mathematics: ");
        int maths = sc.nextInt();
        System.out.print("Enter Marks in Computer Science: ");
        int cs = sc.nextInt();
        int total = english + physics + chemistry + maths + cs;
        double percentage = total / 5.0;

        System.out.println("\n MARKSHEET ");
        System.out.println("Student Name : " + name);
        System.out.println("English : " + english);
        System.out.println("Physics : " + physics);
        System.out.println("Chemistry : " + chemistry);
        System.out.println("Mathematics : " + maths);
        System.out.println("Computer Science : " + cs);
        System.out.println("Total Marks : " + total + "/500");
        System.out.println("Percentage : " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade : A");
        } else if (percentage >= 75) {
            System.out.println("Grade : B");
        } else if (percentage >= 60) {
            System.out.println("Grade : C");
        } else if (percentage >= 40) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : F");
        }
    }
}
