package DAY_10;

import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {

        /*
         *********
         *******
         *****
         ***
         *
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= 2 * (n - row) + 1; col++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
