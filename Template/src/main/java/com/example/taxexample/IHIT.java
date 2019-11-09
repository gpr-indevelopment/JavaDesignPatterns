package com.example.taxexample;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends LowHighTaxTemplate {

    @Override
    protected boolean shouldApplyHighTax(Budget budget) {
        return hasTwoItemsWithSameName(budget);
    }

    @Override
    protected double applyHighTax(Budget budget) {
        return (budget.getValue()*0.13 + 100);
    }

    @Override
    protected double applyLowTax(Budget budget) {
        return (budget.getValue()*(0.01*budget.getItems().size()));
    }

    private boolean hasTwoItemsWithSameName(Budget budget){
        List<String> foundNames = new ArrayList<>();
        for (Item item : budget.getItems()) {
            if(foundNames.contains(item.getName())){
                return true;
            }
            foundNames.add(item.getName());
        }
        return false;
    }
}
