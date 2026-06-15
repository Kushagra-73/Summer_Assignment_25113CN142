package Day_20;

import java.util.Arrays;
import java.util.Scanner;

public class Q77 {
    public static void main(String[] args) {
        //Write a program to Multiply matrices.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix :");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();

        int[][] matrix1 = new int[m1][n1];
        System.out.println("Enter the elements in the first matrix ");
        inputElements(matrix1, sc);
        System.out.println("The first matrix is :");
        displayMatrix(matrix1);

        System.out.println("Enter the number of columns of second matrix :");
        int m2 = n1;
        int n2 = sc.nextInt();

        int[][] matrix2 = new int[m2][n2];
        System.out.println("Enter the elements in the second matrix ");
        inputElements(matrix2, sc);
        System.out.println("The second matrix is");
        displayMatrix(matrix2);

        int[][] result = multiply(matrix1, matrix2);
        displayMatrix(result);

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

    static int[][] multiply(int[][] arr1, int[][] arr2){
        int m1 = arr1.length;
        int n1 = arr1[0].length;
        int n2 = arr2[0].length;

        int[][] result = new int[m1][n2];

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    result[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }

        return result;
    }
}
