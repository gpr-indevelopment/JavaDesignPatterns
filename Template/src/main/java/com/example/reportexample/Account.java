package com.example.reportexample;

public class Account {

    private final String owner;

    private final int agency;

    private final int number;

    private double balance;

    public Account(String owner, int agency, int number) {
        this.owner = owner;
        this.agency = agency;
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
