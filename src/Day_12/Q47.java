package Day_12;

import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        //Write a program to Write function for
        //Fibonacci.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term :");
        int num = sc.nextInt();

        fibonacci(num);
    }

    static void fibonacci(int num ){

        int f1 = 0 , f2 = 1;
        int sum = 0;

        for (int i = 0; i < num; i++) {
            System.out.print(f1 + " ");
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;

        }



    }
}
