package DAY_12;

import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        //Write a program to Write function for perfect
        //number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term :");
        int num = sc.nextInt();

        System.out.println("Is the number " + num + " Perfect Number ? --> " + isPerfect(num));
    }

    static boolean isPerfect(int n){
        int sum = 0;

        for (int i = 1; i <= n/2; i++) {
            if(n % i == 0) sum+=i;
        }
        return sum == n;
    }
}
