package com.example.taxexample;

public abstract class LowHighTaxTemplate implements Tax{

    @Override
    public double calculate(Budget budget) {
        if(shouldApplyHighTax(budget)){
            return applyHighTax(budget);
        }
        else{
            return applyLowTax(budget);
        }
    }

    protected abstract boolean shouldApplyHighTax(Budget budget);

    protected abstract double applyHighTax(Budget budget);

    protected abstract double applyLowTax(Budget budget);
}
