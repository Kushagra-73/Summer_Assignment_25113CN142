package Day_9;

import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        /*
         *****
         *   *
         *   *
         *   *
         *****
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n ; col++) {
                if(col == 1 || col == n || row == 1 || row == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
