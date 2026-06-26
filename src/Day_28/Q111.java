package Day_28;

import java.util.Scanner;

public class Q111 {
    public static void main(String[] args) {
        // Write a program to Create ticket booking system.

        Scanner sc = new Scanner(System.in);

        String movie = "Avengers: Endgame";
        int availableTickets = 50;
        int ticketPrice = 250;

        System.out.println("===== Ticket Booking System =====");
        System.out.println("1. View Movie Details");
        System.out.println("2. Book Ticket");
        System.out.println("3. Check Available Tickets");
        System.out.println("4. Cancel Ticket");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Movie : " + movie);
                System.out.println("Ticket Price : ₹" + ticketPrice);
                System.out.println("Available Tickets : " + availableTickets);
            }
            case 2 -> {
                System.out.print("Enter Number of Tickets: ");
                int tickets = sc.nextInt();
                if (tickets <= availableTickets) {
                    availableTickets = availableTickets - tickets;
                    System.out.println("Booking Successful!");
                    System.out.println("Total Amount : ₹" + (tickets * ticketPrice));
                    System.out.println("Remaining Tickets : " + availableTickets);
                }
                else System.out.println("Tickets Not Available!");

            }

            case 3 -> System.out.println("Available Tickets : " + availableTickets);
            case 4 -> {
                System.out.print("Enter Number of Tickets to Cancel: ");
                int cancel = sc.nextInt();
                availableTickets = availableTickets + cancel;
                System.out.println("Ticket Cancelled Successfully!");
                System.out.println("Available Tickets : " + availableTickets);
            }
            case 5 -> System.out.println("Thank You!");
            default -> System.out.println("Invalid Choice");

        }
    }
}
