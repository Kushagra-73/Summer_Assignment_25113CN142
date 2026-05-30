package Day_3;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the range of the number");
        System.out.println("Enter the starting number :");
        int start = sc.nextInt();
        System.out.println("Enter the ending number :");
        int end = sc.nextInt();

        for(int i = start ; i <= end; i++){
            if(isPrime(i)) System.out.println(i);
        }


    }

    static boolean isPrime(int num){

        for(int i = 2; i <= num / 2; i++ ){
            if(num % i == 0) {
                return false;

            }
        }
        return true;
    }
}
