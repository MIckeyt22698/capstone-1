# capstone-1
Ledger Application - Java Console App
Project Overview

This Ledger Application is a console-based Java program designed to manage
financial transactions for personal or small business use. Users can:
Record deposits and payments
View all transactions, deposits, or payments
Generate financial reports (Month-to-Date, Previous Month, Year-to-Date, Previous Year)
Search transactions by vendor name
All transaction data is saved to and loaded from a CSV file (ledger.csv) to ensure persistence 
across sessions.
-------------------------------------------------------------------------------------------------------
SCREENSHOTS

=== Home Screen ===
    1) Add Deposit
    2) Make Payment
    3) View Ledger
    4) Exit
  Select an option:
-----------------------------
  === Ledger Menu ===
    1) View All Transactions
    2) View Deposits Only
    3) View Payments Only
    4) View Reports
    5) Return to Home Screen
<pre> ```
    === Reports Menu ===
    1) Month To Date
    2) Previous Month
    3) Year To Date
    4) Previous Year
    5) Search by Vendor
    0) Back to Ledger Menu
``` <pre>
-----------------------------------------------------------------------------------------------------
Notable Code Snippet

Console Color Customization with ANSI Codes

This snippet demonstrates how color is added to the console output
 using ANSI escape codes. This improves user experience by visually distinguishing menu options.
{
public class ConsoleColors {
    public static final String RESET = "[0m";
    public static final String RED = "[31m";
    public static final String GREEN = "[32m";
    public static final String YELLOW = "[33m";
    public static final String BLUE = "[34m";
    public static final String PURPLE = "[35m";
    public static final String CYAN = "[36m";
    public static final String WHITE = "[37m";
}}

By using these constants throughout the application, the UI becomes more engaging 
and helps users navigate the menu more easily
--------------------------------------------------------------------------------------------
Project Structure

App.java: Main class controlling user interaction and application logic.

Transactions.java: Model class to represent individual financial entries.

ledger.csv: Data file used for persistent transaction storage.

ConsoleColors.java: Utility for color-coded console output.
----------------------------------------------------------------------------------------------------
How to Run

Compile the application:

javac com/pluralsight/*.java

Run the application:

java com.pluralsight.App
-----------------------------------------------------------------------------------------------------
