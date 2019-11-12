package com.example.accountexample;

public class BankAccount {

    private double balance;

    private AccountState state;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double withdraw(double value){
        this.balance -= value;
        if(this.balance < 0){
            this.state = AccountState.NEGATIVE;
        }
        return value;
    }

    public void deposit(double value){
        this.balance+=value;
        if(this.balance >= 0){
            this.state = AccountState.POSITIVE;
        }
    }
}
