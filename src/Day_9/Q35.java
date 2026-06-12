package Day_9;

import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {

        /*
        A
        BB
        CCC
        DDDD
        EEEEE
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        int x = 65;
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print((char)(x));
            }
            x++;
            System.out.println();
        }
    }
}
