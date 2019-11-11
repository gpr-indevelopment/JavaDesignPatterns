package com.example.taxexample;

public class ICMS extends Tax {

    public ICMS(Tax nextTax) {
        super(nextTax);
    }

    public ICMS() {
    }

    @Override
    public double calculate(Budget budget) {
        return budget.getValue()*0.1 + calculateNextTax(budget);
    }
}
