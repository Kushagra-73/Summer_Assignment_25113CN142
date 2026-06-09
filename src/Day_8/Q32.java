package Day_8;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        /*
        1
        22
        333
        4444
        55555
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();


        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
