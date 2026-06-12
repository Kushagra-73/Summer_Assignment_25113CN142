package DAY_11;

import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        /*
        Write a program to Write function to find
        factorial.
         */

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int ans = factorial(num);
        System.out.println("The factorial of " + num + " is " + ans);

    }

    static int factorial(int n){
        if (n == 0 || n == 1) return 1;
        int factorial = 1;
        for (int i = 2; i <= n ; i++) {
            factorial*=i;
        }
        return factorial;
    }
}
