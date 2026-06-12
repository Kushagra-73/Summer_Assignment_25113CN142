package DAY_11;

import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        /*
        Write a program to Write function to check
        prime
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println(isPrime(n));

    }

    static boolean isPrime(int num){
        if(num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
