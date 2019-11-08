package com.example.bankexample;

public class Account {

    private final String owner;

    private double balance;

    public Account(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
