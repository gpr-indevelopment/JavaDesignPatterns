package com.example.investmentexample;

import java.util.Random;

public enum InvestmentStrategy implements Investment{
    CONSERVATIVE{
        @Override
        public void invest(Account account) {
            double investedValue = account.getBalance();
            account.setBalance(investedValue*1.08);
        }
    }, MODERATE{
        @Override
        public void invest(Account account) {
            double investedValue = account.getBalance();
            Random rand = new Random();
            int randomResult = rand.nextInt(2);
            switch (randomResult){
                case 0:{
                    account.setBalance(investedValue*1.25);
                    break;
                }
                case 1:{
                    account.setBalance(investedValue*1.07);
                    break;
                }
            }
        }
    }, AGGRESSIVE{
        @Override
        public void invest(Account account) {
            double investedValue = account.getBalance();
            Random rand = new Random();
            double randomResult = rand.nextDouble();
            if(randomResult < 0.2){
                account.setBalance(investedValue*1.05);
                return;
            }
            if(randomResult < 0.5){
                account.setBalance(investedValue*1.03);
                return;
            }
            if(randomResult < 1.0){
                account.setBalance(investedValue*1.006);
                return;
            }
        }
    }
}
