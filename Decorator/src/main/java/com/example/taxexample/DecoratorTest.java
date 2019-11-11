package com.example.taxexample;

public class DecoratorTest {

    public static void main(String[] args) {
        Budget budget = new Budget();
        budget.setValue(1000);
        ISS iss = new ISS();
        ICMS icms = new ICMS(iss);
        HighTax highTax = new HighTax(icms);
        System.out.println(highTax.calculate(budget));
    }
}
