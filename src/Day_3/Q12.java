package Day_3;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int hcf = gcd(n1,n2);
        int lcm = (n1 * n2) / hcf;
        System.out.println(lcm);
    }

    static int gcd(int a, int b){
        int smaller;
        if(a > b) smaller = b;
        else smaller = a;
        int gcd = 1;
        for(int i = 1; i <= smaller; i++ ){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

}
