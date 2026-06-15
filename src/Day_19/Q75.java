package Day_19;

import java.util.Arrays;
import java.util.Scanner;

public class Q75 {
    public static void main(String[] args) {
        //Write a program to Transpose matrix.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix :");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix1 = new int[m][n];
        System.out.println("Enter the elements in the matrix ");
        inputElements(matrix1, sc);
        System.out.println("The initial matrix is :");
        displayMatrix(matrix1);

        System.out.println("The transpose of the matrix is :");
        int[][] transposeMatrix = transpose(matrix1);
        displayMatrix(transposeMatrix);

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

    static int[][] transpose(int[][] arr){
        int row = arr[0].length;
        int col = arr.length;
        int[][] transpose = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[i][j] = arr[j][i];
            }
        }

        return transpose;
    }
}
