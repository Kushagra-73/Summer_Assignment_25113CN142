package Day_12;

import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        /*
        Write a program to Write function for
        palindrome.
         */

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println(isPalindrome(num));


    }

    static boolean isPalindrome(int n){
        if(n < 0) return false;
        int temp = n;
        int reverse = 0;
        while(temp > 0){
            reverse *= 10;
            int rem = temp % 10;
            reverse += rem;
            temp /= 10;
        }
        return (reverse == n);

    }
}
