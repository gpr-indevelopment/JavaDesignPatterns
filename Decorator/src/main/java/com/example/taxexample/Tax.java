package com.example.taxexample;

import java.util.Objects;

public abstract class Tax {

    private Tax nextTax;

    public Tax(Tax nextTax) {
        this.nextTax = nextTax;
    }

    public Tax() {
        this.nextTax = null;
    }

    public abstract double calculate(Budget budget);

    protected double calculateNextTax(Budget budget){
        if(Objects.nonNull(nextTax)){
            return nextTax.calculate(budget);
        }
        return 0;
    }
}
