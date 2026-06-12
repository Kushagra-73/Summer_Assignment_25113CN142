package Day_7;

import java.util.Scanner;

public class Q26 {
//    Write a program to Recursive Fibonacci.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which term you want of the fibonacci series :");
        int n = sc.nextInt();

        int answer = fibonacci(n);
        System.out.println(answer);
    }

    static int fibonacci(int num){
        if(num == 0) return 0;
        if(num == 1) return 1;
        int ans = fibonacci(num - 1) + fibonacci(num - 2);
        return ans;
    }
}
