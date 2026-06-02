package DAY_5;

import java.util.Scanner;

public class Q20 {
//    Write a program to Find largest prime factor.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number :");
            int n = sc.nextInt();
            int maxPrime = -1;
            for (int i = 1; i <= n; i++) {
                if(n % i == 0 && isPrime(i)) {
                    maxPrime = i;
                }
            }

//            System.out.println(isPrime(3));
            System.out.println(maxPrime);
        }

        static boolean isPrime(int n){
            boolean ans = true;
            for (int i = 2; i < n/2; i++) {
                if(n % i == 0){
                    ans = false;
                    break;
                }


            }

            return ans;
        }

}
