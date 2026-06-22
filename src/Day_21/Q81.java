package Day_21;

import java.util.Scanner;

public class Q81 {
    public static void main(String[] args) {
        //Write a program to Find string length
        //without strlen().
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;
        for (char ch : str.toCharArray()) {
            count++;
        }

        System.out.println("Length of the string = " + count);
    }
}
