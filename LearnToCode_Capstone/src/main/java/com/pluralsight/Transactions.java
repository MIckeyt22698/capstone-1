package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transactions {
    LocalDateTime transTime;
    String description;
    String vendor;
    double amount;

    public Transactions(LocalDateTime transTime, double amount, String vendor, String description) {
        this.transTime = transTime;
        this.amount = amount;
        this.vendor = vendor;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTransTime(LocalDateTime transTime) {
        this.transTime = transTime;
    }

    public LocalDateTime getTransTime() {
        return transTime;
    }

    public String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
        return transTime.format(formatter);
    }


    @Override
    public String toString() {
        return String.format("%s | %-15s | %-10s | $%.2f",getFormattedDate(), vendor, description, amount);
    }
}
