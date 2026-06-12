package DAY_12;

import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        /*
        Write a program to Write function for
        Armstrong
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        System.out.println("Is " + num + " Armstrong number ? -- > " + isArmstrong(num));

    }


    static boolean isArmstrong(int num){
        int temp = num;
        int count = countDigits(temp);
        temp = num;
        int sum = 0;
        while (temp > 0){
            int rem = temp % 10;
            sum += Math.pow(rem, count);
            temp /= 10;
        }

        return num == sum;

    }

    static int countDigits(int num){
        int digits = 0;
        int temp = num;
        while (temp > 0){
            digits++;
            temp/=10;
        }
        return digits;
    }
}
