import java.util.Scanner;

public class Q2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want the multiplication table :");
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(n + "x" + i + "=" + i*n);
        }

    }
}
