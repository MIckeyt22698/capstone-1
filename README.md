# capstone-1
Ledger Application - Java Console App
Project Overview

This Ledger Application is a console-based Java program designed to manage
financial transactions for personal or small business use. Users can:

Record deposits and payments.

View all transactions, deposits, or payments.

Generate financial reports (Month-to-Date, Previous Month, Year-to-Date, Previous Year)
Search transactions by vendor name.

All transaction data is saved to and loaded from a CSV file (ledger.csv) to ensure persistence 
across sessions.
-------------------------------------------------------------------------------------------------------
SCREENSHOTS
```java
=== Home Screen ===
    1) Add Deposit
    2) Make Payment
    3) View Ledger
    4) Exit
  Select an option:
  ```
-----------------------------
```java
  === Ledger Menu ===
    1) View All Transactions
    2) View Deposits Only
    3) View Payments Only
    4) View Reports
    5) Return to Home Screen
```
```java
    === Reports Menu ===
    1) Month To Date
    2) Previous Month
    3) Year To Date
    4) Previous Year
    5) Search by Vendor
    0) Back to Ledger Menu
```
-----------------------------------------------------------------------------------------------------
Notable Code Snippet

Console Color Customization with ANSI Codes

This snippet demonstrates how color is added to the console output
 using ANSI escape codes. This improves user experience by visually distinguishing menu options.
```java
public class ConsoleColors {
    public static final String RESET = "[0m";
    public static final String RED = "[31m";
    public static final String GREEN = "[32m";
    public static final String YELLOW = "[33m";
    public static final String BLUE = "[34m";
    public static final String PURPLE = "[35m";
    public static final String CYAN = "[36m";
    public static final String WHITE = "[37m";
}
```

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


Tuesday

Reviewed team objectives and familiarized myself with current projects

Observed team workflows and general operational processes

reviewed project materials and documentation

Participated in team discussions and onboarding activities

Completed assigned training modules related to bank fundamentals

Used available downtime for structured learning and review

Wednesday

Continued learning about team processes and project structure

Shadowed team members to better understand daily responsibilities

joined meetings in collaborative discussions

Completed training modules focused on professional development and technical foundations

Utilized downtime for additional training and review

Thursday

Participated in team meetings and planning conversations

Reviewed general project requirements and expectations

Supported organizational and administrative tasks as needed

Continued observation of workflow and team coordination

Completed assigned training modules

Documented key learning points and progress

Friday

Reviewed weekly objectives and ongoing initiatives

Participated in team collaboration sessions

Continued professional development training

Reflected on Mylearning progress and areas for improvement

Finalized weekly summary of activities

Weekly Summary

Focused on learning organizational processes and team structure

Supported general team activities

Completed multiple training modules

Used downtime productively for professional development

Continued building foundational knowledge as a Newish hire.


