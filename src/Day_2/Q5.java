package Day_2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //Sum of digits

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");

        int n = sc.nextInt();
        int temp = n;
        if (temp < 0) temp *= -1;
        int sum = 0;
        while (temp > 0){

            sum += temp % 10;
            temp /= 10;

        }

        System.out.println("The sum of the digits of the number " + n + " is " + sum);
    }
}
