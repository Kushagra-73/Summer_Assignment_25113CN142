package Day_4;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        //fibonaaci series

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term :");
        int n = sc.nextInt();

        int f1 = 0 , f2 = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;

        }

        System.out.println(f1);

    }
}
