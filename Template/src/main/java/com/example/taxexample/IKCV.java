package com.example.taxexample;

public class IKCV extends LowHighTaxTemplate{

    @Override
    protected boolean shouldApplyHighTax(Budget budget) {
        return (budget.getValue() > 500 && hasItemWithValueHigherThan(budget, 100));
    }

    @Override
    protected double applyHighTax(Budget budget) {
        return budget.getValue()*0.1;
    }

    @Override
    protected double applyLowTax(Budget budget) {
        return budget.getValue()*0.06;
    }

    private boolean hasItemWithValueHigherThan(Budget budget, double value){
        for (Item item : budget.getItems()) {
            if(item.getValue() > value){
                return true;
            }
        }
        return false;
    }
}
