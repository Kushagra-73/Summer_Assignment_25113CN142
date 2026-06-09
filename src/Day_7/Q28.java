package Day_7;

import java.util.Scanner;

public class Q28 {
//    Write a program to Recursive reverse number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int reverse = reverseOfNumber(n, 0);
        System.out.println("The reverse of the number " + n + " is " + reverse);
    }

    static int reverseOfNumber(int n, int rev) {
        if (n == 0) return rev;
        return reverseOfNumber(n / 10, rev * 10 + (n % 10));
    }
}
