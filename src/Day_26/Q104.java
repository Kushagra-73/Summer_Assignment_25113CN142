package Day_26;

import java.util.Scanner;

public class Q104 {
    static void main(String[] args) {
        // Write a program to Create quiz application.
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("***** CODING QUIZ *****");

        System.out.println("\n1. Which language is used to write Java programs?");
        System.out.println("a) Java");
        System.out.println("b) Python");
        System.out.println("c) C");
        char ans1 = sc.next().charAt(0);

        if (ans1 == 'a') {
            score = score + 1;
        }

        System.out.println("\n2. Which method is the entry point of a Java program?");
        System.out.println("a) start()");
        System.out.println("b) main()");
        System.out.println("c) run()");
        char ans2 = sc.next().charAt(0);

        if (ans2 == 'b') {
            score = score + 1;
        }

        System.out.println("\n3. Which keyword is used to create an object in Java?");
        System.out.println("a) class");
        System.out.println("b) new");
        System.out.println("c) static");
        char ans3 = sc.next().charAt(0);

        if (ans3 == 'b') {
            score = score + 1;
        }

        System.out.println("\n4. Which loop is used when the number of iterations is known?");
        System.out.println("a) for");
        System.out.println("b) while");
        System.out.println("c) do-while");
        char ans4 = sc.next().charAt(0);

        if (ans4 == 'a') {
            score = score + 1;
        }

        System.out.println("\n5. Which data type stores whole numbers?");
        System.out.println("a) int");
        System.out.println("b) float");
        System.out.println("c) char");
        char ans5 = sc.next().charAt(0);

        if (ans5 == 'a') {
            score = score + 1;
        }

        System.out.println("\nYour Score = " + score + "/5");
    }
}
