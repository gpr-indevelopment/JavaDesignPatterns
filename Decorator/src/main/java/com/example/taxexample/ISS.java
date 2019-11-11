package com.example.taxexample;

public class ISS extends Tax {

    public ISS(Tax nextTax) {
        super(nextTax);
    }

    public ISS() {
    }

    @Override
    public double calculate(Budget budget) {
        return budget.getValue()*0.06 + calculateNextTax(budget);
    }
}
