package Day_8;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {

        /*
        1
        12
        123
        1234
        12345
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
