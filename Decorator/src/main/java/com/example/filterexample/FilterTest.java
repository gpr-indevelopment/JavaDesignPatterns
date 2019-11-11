package com.example.filterexample;

import java.util.Arrays;

public class FilterTest {

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setBalance(10000);
        Account a2 = new Account();
        a2.setBalance(250);
        Account a3 = new Account();
        a3.setBalance(550);
        Account a4 = new Account();
        a4.setBalance(50);
        Account a5 = new Account();
        a5.setBalance(350);
        Account a6 = new Account();
        a6.setBalance(450);
        BalanceHTFiveHundredsFilter filter1 = new BalanceHTFiveHundredsFilter();
        BalanceLTOneHundredFilter filter2 = new BalanceLTOneHundredFilter(filter1);
        CurrentMonthCreationDateFilter filter3 = new CurrentMonthCreationDateFilter(filter2);
        System.out.println(filter3.filter(Arrays.asList(a1, a2, a3, a4, a5, a6)).size());
    }
}
