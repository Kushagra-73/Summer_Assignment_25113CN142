package Day_29;

import java.util.Scanner;

public class Q114 {
    public static void main(String[] args) {
        // Write a program to Create menu-driven array operations system.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        while (true) {
            System.out.println("\n Menu-Driven Array Operations ");
            System.out.println("1. Display Array");
            System.out.println("2. Find Maximum");
            System.out.println("3. Find Minimum");
            System.out.println("4. Calculate Sum");
            System.out.println("5. Calculate Average");
            System.out.println("6. Search Element");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Array Elements: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    int max = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Maximum Element = " + max);
                    break;
                case 3:
                    int min = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.println("Minimum Element = " + min);
                    break;

                case 4:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                    }
                    System.out.println("Sum = " + sum);
                    break;
                case 5:
                    int total = 0;
                    for (int i = 0; i < n; i++) {
                        total += arr[i];
                    }
                    double average = (double) total / n;
                    System.out.println("Average = " + average);
                    break;

                case 6:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Element not found.");
                    }
                    break;
                case 7:
                    System.out.println("Thank you for using Array Operations System.");
                    sc.close();
                    return;

                default: System.out.println("Invalid choice.");
            }
        }
    }
}
