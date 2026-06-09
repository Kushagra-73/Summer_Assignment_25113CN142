package DAY_10;

import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {

        /*
            1
           121
          12321
         1234321
        123454321
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            for (int col = row - 1; col >= 1; col--) {
                System.out.print(col);
            }

            System.out.println();
        }

    }
}
