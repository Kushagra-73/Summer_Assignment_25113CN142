package Day_1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter a number upto which you want the sum : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n+1; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
