package DAY_11;

import java.util.Scanner;

public class Q41 {
    //Write a program to Write function to find sum
    //of two numbers.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = sum(a,b);
        System.out.println(a + " + " + b + " = " + ans);
    }

    static int sum(int a, int b){
        return a + b;
    }
}
