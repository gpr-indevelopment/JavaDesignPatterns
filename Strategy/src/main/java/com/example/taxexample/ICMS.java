package com.example.taxexample;

public class ICMS implements Tax {

    @Override
    public double calculate(Budget budget) {
        return (budget.getValue()*0.05 + 50.0);
    }
}
