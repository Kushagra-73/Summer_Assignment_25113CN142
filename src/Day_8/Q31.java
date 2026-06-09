package Day_8;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {

        /*
        A
        AB
        ABC
        ABCD
        ABCDE
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        for (int row = 1; row <= n ; row++) {
            int x = 65;
            for (int col = 1; col <= row ; col++) {

                System.out.print((char)x);
                x++;
            }
            System.out.println();
        }
    }
}
