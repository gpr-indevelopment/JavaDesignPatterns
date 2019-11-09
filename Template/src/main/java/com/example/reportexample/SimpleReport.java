package com.example.reportexample;

import java.util.List;

public class SimpleReport extends ReportTemplate {

    @Override
    protected void printHeader(List<Account> accounts, Bank bank) {
        System.out.println(String.format("Bank: %s", bank.getName()));
    }

    @Override
    protected void printBody(List<Account> accounts, Bank bank) {
        accounts.forEach(account -> System.out.println(String.format("Owner: %s. Balance = %f", account.getOwner(), account.getBalance())));
    }

    @Override
    protected void printFooter(List<Account> accounts, Bank bank) {
        System.out.println(String.format("Telephone number: %d", bank.getTelephoneNumer()));
    }
}
