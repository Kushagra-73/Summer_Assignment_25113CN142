package Day_19;

import java.util.Arrays;
import java.util.Scanner;

public class Q76 {
    public static void main(String[] args) {
        // Write a program to Find diagonal sum.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix :");
        int m = sc.nextInt();


        int[][] matrix1 = new int[m][m];
        System.out.println("Enter the elements in the matrix ");
        inputElements(matrix1, sc);
        System.out.println("The matrix is :");
        displayMatrix(matrix1);

        int dSum = diagonalSum(matrix1);
        System.out.println("The Diagonal sum of the matrix is :" + dSum);

    }

    static void displayMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    static void inputElements(int[][] arr, Scanner sc){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the element at position :" + "(" + i + "," + j + ")");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static int diagonalSum(int[][] arr){
        int row = arr.length;
        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if(i == j){
                    sum+= arr[i][j];
                } else if (i + j == row - 1 && i != j) {
                    sum+=arr[i][j];
                }
            }
        }

        return sum;
    }
}
