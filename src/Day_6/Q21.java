package Day_6;

import java.util.Scanner;

public class Q21 {
//    Write a program to Convert decimal to binary.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        float n = sc.nextInt();

        if( n <0) System.out.println("Enter positive number");
        else{
            int integerPart = (int) n;
            float fractionalPart = n - integerPart;

            int ansInt = 0;
            int temp = integerPart;

            while(temp > 0) {
                ansInt *= 10;
                ansInt += temp % 2;
                temp /= 2;

            }

            System.out.println(reverse(ansInt));

        }

    }

    static int reverse(int num){
        int temp = num;
        int ans = 0;
        while (temp > 0){
            ans *= 10;
            int rem = temp % 10;

            ans += rem;
            temp /= 10;

        }
        return ans;
    }
}
