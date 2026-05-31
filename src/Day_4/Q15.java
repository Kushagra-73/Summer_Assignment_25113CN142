package Day_4;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int temp = num;
        int count = countDigits(temp);
        temp = num;

        int rev = 0;
        while (temp > 0){
            int rem = temp % 10;
            rev += Math.pow(rem,count);
            temp /= 10;
        }

        System.out.println("Is " + num + " Armstrong number ? -- > " + (rev == num));

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
