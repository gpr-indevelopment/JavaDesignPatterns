package com.example.taxexample;

public class Test2 {

    public static void main(String[] args) {
        Budget budget = new Budget(150.0);
        TaxStrategy.ICCC.calculate(budget);
    }
}
