package Day_7;

import java.util.Scanner;

public class Q25 {
//    Write a program to Recursive factorial.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");

        int n = sc.nextInt();

        int fact = factorial(n);

        System.out.println(fact);
    }

    static int factorial(int num){
        if(num == 0 || num == 1) return 1;

        return num * factorial(num - 1);
    }
}
