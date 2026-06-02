package DAY_6;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int temp = num;

        int count = count(num);
        int ans = 0;
        for (int i = 0; i < count; i++) {

            ans += ((temp % 10) * Math.pow(2,i));
            temp /= 10;
        }

        System.out.println(ans);
    }
    static int count(int num){
        int count = 0;

        int temp = num;
        while(temp > 0){
            count++;
            temp/=10;
        }
        return count;
    }


}



