package com.pluralsight;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static Scanner keystrokes = new Scanner(System.in);
    private static ArrayList<Transactions> ledger = new ArrayList<>();


    public static void main(String[] args) {


        boolean running = true;
        while (running) {
            homeScreen();
            int selectedMenuOption = keystrokes.nextInt();
            keystrokes.nextLine();

            switch (selectedMenuOption) {
                case 1:
                    addDeposit();
                    break;
                case 2:
                    makePayment();
                    break;
                case 3:
                    viewLedger();
                    break;
                case 4:
                    System.out.println("Goodbye");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid menu option. Try again.");
            }
        }
    }

    public static void homeScreen() {
        System.out.println("\n=== Home Screen ===");
        System.out.println("1) Add Deposit");
        System.out.println("2) Make Payment");
        System.out.println("3) View Ledger");
        System.out.println("4) Exit");
        System.out.print("Select an option: ");
    }


    public static void addDeposit() {
        System.out.println("\n=== Add Deposit ===");
        System.out.print("Enter deposit amount: ");
        double amount = keystrokes.nextDouble();
        keystrokes.nextLine(); // consume newline
        System.out.print("Enter vendor: ");
        String vendor = keystrokes.nextLine();
        System.out.print("Enter description: ");
        String description = keystrokes.nextLine();

        Transactions newDeposit = new Transactions(amount, vendor, description);
        saveTransaction(newDeposit);

        promptReturnToMenu();

    }

    public static void makePayment() {
        System.out.println("\n=== Make Payment ===");
        System.out.print("Enter payment amount: ");
        double amount = keystrokes.nextDouble();
        keystrokes.nextLine(); // consume newline
        System.out.print("Enter vendor: ");
        String vendor = keystrokes.nextLine();
        System.out.print("Enter description: ");
        String description = keystrokes.nextLine();

        // Payments are negative amounts
        Transactions newPayment = new Transactions(amount, vendor, description);
        saveTransaction(newPayment);

        promptReturnToMenu();

    }

    public static void viewLedger() {
        boolean viewing = true;

        while (viewing) {
            System.out.println("\n=== Ledger Menu ===");
            System.out.println("1) View All Transactions");
            System.out.println("2) View Deposits Only");
            System.out.println("3) View Payments Only");
            System.out.println("4) Return to Home Screen");
            System.out.print("Select an option: ");

            int choice = keystrokes.nextInt();
            keystrokes.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    printAllTransactions();
                    break;
                case 2:
                    printDepositsOnly();
                    break;
                case 3:
                    printPaymentsOnly();
                    break;
                case 4:
                    viewing = false; // exit the ledger menu
                    break;
                default:
                    System.out.println("Invalid menu option. Try again.");
            }
        }
    }
}

    public static void printAllTransactions() {
        System.out.println("\n=== All Transactions ===");
        for (Transactions t : ledger) {
            printTransaction(t);
        }
    }


public static void printDepositsOnly() {
    System.out.println("\n=== Deposits Only ===");
    for (Transactions t : ledger) {
        if (t.getAmount() > 0) { // Deposits are positive
            printTransaction(t);
        }
    }
}

public static void printPaymentsOnly() {
    System.out.println("\n=== Payments Only ===");
    for (Transactions t : ledger) {
        if (t.getAmount() < 0) { // Payments are negative
            printTransaction(t);
        }
    }
}

public static void printTransaction(Transactions t) {
    System.out.printf("%s | %s | %s | $%.2f\n",
            t.getTransTime(),
            t.getVendor(),
            t.getDescription(),
            t.getAmount());
}

public static void promptReturnToMenu() {
    System.out.println("\nPress ENTER to return to the Home Screen...");
    keystrokes.nextLine();
}

public static void saveTransaction(Transactions transaction) {
    ledger.add(transaction); // For now, just add to our list (later you'll save to CSV)
    System.out.println("Transaction saved!");
}
