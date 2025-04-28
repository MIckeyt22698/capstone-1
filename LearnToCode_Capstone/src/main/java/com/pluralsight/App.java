package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static Scanner keystrokes = new Scanner(System.in);
    private static ArrayList<Transactions> ledger = new ArrayList<>();
//    this declares a static ArrayList named ledger that will store Transactions objects


    public static void main(String[] args) {

//      keeps the program running until the user chooses to exit.
        boolean running = true;
        while (running) {
            homeScreen();
//            Calling homescreen method below
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
//                    Based on the user input (selected menu option), the program branches to one of the methods
//                        (addDeposit(), makePayment(), viewLedger(), or exit the loop).
            }
        }
    }


    public static void homeScreen() {
        System.out.println("\n=== Home Screen ===");
        System.out.println("1) Add Deposit");
        System.out.println("2) Make Payment");
        System.out.println("3) View Ledger");
        System.out.println("4) Exit");
        System.out.print("Select an option: ");}
//    Displays the main menu options to the user
//    It prompts the user to select an option by typing a number.


    public static void addDeposit (){
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
//        it prompts the user for the deposit amount, vendor, and description, creates a new Transactions object
//        with these values and adds it to the ledger using saveTransaction().

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
        Transactions newPayment = new Transactions(-amount, vendor, description);
        saveTransaction(newPayment);

        promptReturnToMenu();
//        It collects similar information as the addDeposit() method, but the
//        amount is made negative to represent a payment (outflow).

    }

    public static void viewLedger() {
        boolean viewing = true;

//        This method shows the "Ledger Menu," where the user can view all transactions, deposits only, payments only, or return to the home screen.
//         It uses a while loop to keep the menu active until the user decides to exit.

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



public static void printAllTransactions() {
    System.out.println("\n=== All Transactions ===");
    for (Transactions t : ledger) {
        printTransaction(t);
//        Prints all transactions stored in the ledger
    }
}


public static void printDepositsOnly() {
    System.out.println("\n=== Deposits Only ===");
    for (Transactions t : ledger) {
        if (t.getAmount() > 0) { // Deposits are positive
            printTransaction(t);
        }
//        Prints only transactions where the amount is greater than zero (deposits).
    }
}

public static void printPaymentsOnly() {
    System.out.println("\n=== Payments Only ===");
    for (Transactions t : ledger) {
        if (t.getAmount() < 0) { // Payments are negative
            printTransaction(t);
//            Prints only transactions where the amount is less than zero (payments).
        }
    }
}

public static void printTransaction(Transactions t) {
    System.out.printf("%s | %s | %s | $%.2f\n",
            t.getVendor(),
            t.getDescription(),
            t.getAmount());
//    Helper method that prints a single Transactions object in a formatted way.
}

public static void promptReturnToMenu() {
    System.out.println("\nPress ENTER to return to the Home Screen...");
    keystrokes.nextLine();
}

public static void saveTransaction(Transactions transaction) {
    ledger.add(transaction); // Still need CSV DONT FORGET!
    System.out.println("Transaction saved!");
}
}
