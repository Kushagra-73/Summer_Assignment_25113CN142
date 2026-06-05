package Day_5;

import java.util.Scanner;

public class Q18 {
//    Write a program to Check strong number.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        
        int n = sc.nextInt();
        
        int sum = 0;
        int temp = n;

        while ( temp > 0 ){
            int rem = temp % 10;
            sum += factorial(rem);
            temp /= 10;
        }

        System.out.println(factorial(5));

        System.out.println("Is the number " + n + " Stron number ? -- >" + (n == sum));
        
    }
    
    static int factorial(int num){
        if (num == 0) return 1;
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}

