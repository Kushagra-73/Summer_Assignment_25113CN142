package DAY_11;

import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        //Write a program to Write function to find
        //maximum.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        max(a,b);


    }

    static void max(int x, int y){
        if(x == y) System.out.println("Both numbers are equal");
        else if (x > y) System.out.println("Out of " + x + " and " + y + " , " + x + " is maximum");
        else System.out.println("Out of " + x + " and " + y + " , " + y + " is maximum");
    }
}
