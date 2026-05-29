package Day_2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");

        int n = sc.nextInt();
        int temp = n;
        if (temp < 0) temp *= -1;
        int product = 1;
        while (temp > 0){

            product *= temp % 10;
            temp /= 10;

        }

        System.out.println("The product of the digits of the number " + n + " is " + product);
    }
}
