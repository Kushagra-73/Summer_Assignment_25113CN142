package Day_9;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {

        /*
        12345
        1234
        123
        12
        1
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n + 1 - row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
