package com.example.taxexample;

public class ISS implements Tax {

    @Override
    public double calculate(Budget budget) {
        return budget.getValue()*0.06;
    }
}
