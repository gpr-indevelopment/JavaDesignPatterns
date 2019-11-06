package com.example.investmentexample;

public class Test1 {
    public static void main(String[] args) {
        Account account = new Account(1000);
        for(int i=0;i<5;i++){
            InvestmentStrategy.AGGRESSIVE.invest(account);
            System.out.println(account.getBalance());
            account.setBalance(1000);
        }
    }
}
