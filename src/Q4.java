import javax.xml.transform.Source;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        int temp = n;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        System.out.println("Number of digits in the number " + n + " is " + count);
    }
}
