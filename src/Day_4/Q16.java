package Day_4;

import java.nio.channels.AcceptPendingException;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of numbers ");
        System.out.println("Enter the starting number :");
        int start = sc.nextInt();
        System.out.println("Enter the ending number :");
        int end = sc.nextInt();

        for(int i = start; i <= end ; i++){
            if(isArmstrong(i)) System.out.print(i + " ");
        }
    }

    static boolean isArmstrong(int num){
        int temp = num;
        int count = count(temp);
        temp = num;

        int rev = 0;
        while (temp > 0){
            int rem = temp % 10;
            rev += Math.pow(rem,count);
            temp /= 10;
        }
        return (rev == num);
    }

    static int count(int num){
        int digits = 0;
        int temp = num;
        while (temp > 0){
            digits++;
            temp/=10;
        }
        return digits;
    }
}
