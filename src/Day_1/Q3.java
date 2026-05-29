package Day_1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //factorial

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        int factorial = 1;

        for (int i = n ; i > 1 ; i--) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is " + factorial);
    }
}
