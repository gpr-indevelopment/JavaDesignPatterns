package com.example.taxexample;

public class ICPP extends LowHighTaxTemplate {

    @Override
    protected boolean shouldApplyHighTax(Budget budget) {
        return budget.getValue() >= 500;
    }

    @Override
    protected double applyHighTax(Budget budget) {
        return budget.getValue()*0.07;
    }

    @Override
    protected double applyLowTax(Budget budget) {
        return budget.getValue()*0.05;
    }
}
