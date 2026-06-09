package Day_7;

import java.util.Scanner;

public class Q27 {
//    Write a program to Recursive sum of digits.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        int sum = sumOfDigits(n);
        System.out.println("The sum of digits is  : " + sum);

    }

    static int sumOfDigits(int n){
        if(n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);

    }

}
