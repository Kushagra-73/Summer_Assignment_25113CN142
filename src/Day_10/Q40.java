package Day_10;

import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        /*
            A
           ABA
          ABCBA
         ABCDCBA
        ABCDEDCBA
         */

        Scanner sc = new Scanner(System.in);

        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 65; col <= 65 + row - 1; col++) {
                System.out.print((char) col);
            }
            for (int col = 65 + row - 2; col >= 65; col--) {
                System.out.print((char) col);
            }

            System.out.println();
        }
    }
}
