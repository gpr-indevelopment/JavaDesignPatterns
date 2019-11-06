package com.example.taxexample;

public class TaxCalculator {

    public void calculate(Budget budget, Tax tax){
        double result = tax.calculate(budget);
        System.out.println("The taxes calculated were: " + result);
    }
}
