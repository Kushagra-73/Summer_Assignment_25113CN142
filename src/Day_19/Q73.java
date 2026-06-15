package Day_19;

import java.util.Arrays;
import java.util.Scanner;

public class Q73 {
    public static void main(String[] args) {
        //Write a program to Add matrices

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of both matrices :");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix1 = new int[m][n];
        System.out.println("Enter the elements in the first matrix ");
        inputElements(matrix1, sc);
        System.out.println("The first matrix is :");
        displayMatrix(matrix1);

        int[][] matrix2 = new int[m][n];
        System.out.println("Enter the elements in the second matrix ");
        inputElements(matrix2, sc);
        System.out.println("The second matrix is");
        displayMatrix(matrix2);

        System.out.println("The addition of the two matrix is :");
        int[][] additionMatrix = add(matrix1,matrix2);
        displayMatrix(additionMatrix);

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

    static int[][] add(int[][] arr1, int[][] arr2){
        int rows = arr1.length;
        int columns = arr1[0].length;

        int[][] additionMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                additionMatrix[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return additionMatrix;
    }
}
