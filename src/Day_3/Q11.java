package Day_3;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int smaller;
        if(n1 > n2) smaller = n2;
        else smaller = n1;
        int gcd = 1;
        for(int i = 1; i <= smaller; i++ ){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
