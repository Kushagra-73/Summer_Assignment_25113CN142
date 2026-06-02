package DAY_5;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Write a program to Check perfect number
        //A perfect number is a positive integer that is
        // equal to the sum of its proper divisors (all positive divisors excluding the number itself).

        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n/2; i++) {
            if(n % i == 0) sum+=i;
        }

        System.out.println("Is " + n + " a perfect number? -->" + (sum == n));

    }
}
