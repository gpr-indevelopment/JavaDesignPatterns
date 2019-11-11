package com.example.taxexample;

public class HighTax extends Tax {

    public HighTax(Tax nextTax) {
        super(nextTax);
    }

    public HighTax() {
    }

    @Override
    public double calculate(Budget budget) {
        return budget.getValue()*0.2 + calculateNextTax(budget);
    }
}
