package com.example.reportexample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ComplexReport extends ReportTemplate {

    @Override
    protected void printHeader(List<Account> accounts, Bank bank) {
        String print = String.format("Bank: %s - Address: %s - Telephone number: %s",
                bank.getName(),
                bank.getAddress(),
                bank.getTelephoneNumer());
        System.out.println(print);
    }

    @Override
    protected void printBody(List<Account> accounts, Bank bank) {
        accounts.forEach(account -> {
            String print = String.format("Owner: %s. Agency: %d. AccountNumber: %d. Balance: %f",
                    account.getOwner(),
                    account.getAgency(),
                    account.getNumber(),
                    account.getBalance());
            System.out.println(print);
        });
    }

    @Override
    protected void printFooter(List<Account> accounts, Bank bank) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String print = String.format("E-mail: %s - Date: %s", bank.getEmail(), dateFormat.format(date));
        System.out.println(print);
    }
}
