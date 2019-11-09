package com.example.reportexample;

import java.util.List;

public abstract class ReportTemplate implements ReportPrinter{

    @Override
    public final void print(List<Account> accounts, Bank bank) {
        printHeader(accounts, bank);
        printBody(accounts, bank);
        printFooter(accounts, bank);
    }

    protected abstract void printHeader(List<Account> accounts, Bank bank);

    protected abstract void printBody(List<Account> accounts, Bank bank);

    protected abstract void printFooter(List<Account> accounts, Bank bank);
}
