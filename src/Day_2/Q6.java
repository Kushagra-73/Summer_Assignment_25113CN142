package Day_2;

import java.util.Scanner;

public class Q6 {
    //reverse the number;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");

        int n = sc.nextInt();
        int temp = n;
        int reverse = 0;
        while (temp > 0){
            reverse*=10;
            reverse += temp % 10;
            temp /= 10;
        }
        System.out.println(reverse);

    }


}
