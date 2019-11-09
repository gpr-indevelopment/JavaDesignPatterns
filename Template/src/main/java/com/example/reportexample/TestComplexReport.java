package com.example.reportexample;

import java.util.Arrays;
import java.util.List;

public class TestComplexReport {
    public static void main(String[] args) {
        Bank bank = new Bank("Boston", "Av Nereu Ramos");
        bank.setTelephoneNumer(123456);
        bank.setEmail("testbank@gmail.com");
        Account a1 = new Account("Gabriel", 13, 121212);
        a1.setBalance(14);
        Account a2 = new Account("Bruna", 14, 111111);
        a2.setBalance(19);
        Account a3 = new Account("Fernando", 16, 16161616);
        a3.setBalance(15);
        List<Account> accounts = Arrays.asList(a1, a2, a3);
        ComplexReport complexReport = new ComplexReport();
        complexReport.print(accounts, bank);
    }
}
