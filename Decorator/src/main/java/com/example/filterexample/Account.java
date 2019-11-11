package com.example.filterexample;

import java.util.Date;

public class Account {

    private double balance;

    private final Date creationDate;

    public Account() {
        this.creationDate = new Date();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
