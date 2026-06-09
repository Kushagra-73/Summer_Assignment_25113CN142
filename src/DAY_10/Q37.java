package DAY_10;

import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        /*
             *
            ***
           *****
          *******
         *********
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= (2 * row) - 1; col++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
