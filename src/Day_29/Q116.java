package Day_29;

import java.util.Scanner;

public class Q116 {
    public static void main(String[] args) {
        // Write a program to Create inventory management system.

        Scanner sc = new Scanner(System.in);

        String[] productNames = new String[100];
        int[] quantities = new int[100];
        double[] prices = new double[100];
        int count = 0;

        while (true) {
            System.out.println("\n Inventory Management System ");
            System.out.println("1. Add Product");
            System.out.println("2. View Inventory");
            System.out.println("3. Search Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Update Quantity");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    if (count < 100) {
                        System.out.print("Enter Product Name: ");
                        productNames[count] = sc.nextLine();
                        System.out.print("Enter Quantity: ");
                        quantities[count] = sc.nextInt();
                        System.out.print("Enter Price: ");
                        prices[count] = sc.nextDouble();
                        sc.nextLine();
                        count++;
                        System.out.println("Product added successfully.");
                    }
                    else {
                        System.out.println("Inventory is full.");
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No products available.");
                    }
                    else {
                        System.out.println("\n----- Inventory -----");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". Product: " + productNames[i]);
                            System.out.println("   Quantity: " + quantities[i]);
                            System.out.println("   Price: ₹" + prices[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Product Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (productNames[i].equalsIgnoreCase(search)) {
                            System.out.println("Product Found:");
                            System.out.println("Name: " + productNames[i]);
                            System.out.println("Quantity: " + quantities[i]);
                            System.out.println("Price: ₹" + prices[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Product Name to Delete: ");
                    String delete = sc.nextLine();
                    boolean deleted = false;
                    for (int i = 0; i < count; i++) {
                        if (productNames[i].equalsIgnoreCase(delete)) {
                            for (int j = i; j < count - 1; j++) {
                                productNames[j] = productNames[j + 1];
                                quantities[j] = quantities[j + 1];
                                prices[j] = prices[j + 1];
                            }
                            count--;
                            deleted = true;
                            System.out.println("Product deleted successfully.");
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Product not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Product Name to Update Quantity: ");
                    String update = sc.nextLine();
                    boolean updated = false;
                    for (int i = 0; i < count; i++) {
                        if (productNames[i].equalsIgnoreCase(update)) {
                            System.out.print("Enter New Quantity: ");
                            quantities[i] = sc.nextInt();
                            updated = true;
                            System.out.println("Quantity updated successfully.");
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Product not found.");
                    }
                    break;
                case 6:
                    System.out.println("Thank you for using Inventory Management System.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
