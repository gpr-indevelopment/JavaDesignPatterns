package com.example.taxexample;

public class ICCC implements Tax {

    @Override
    public double calculate(Budget budget) {
        double value = budget.getValue();
        if(value < 1000.00){
            return value*0.05;
        }
        if(value <= 3000.00){
            return value*0.07;
        }
        else{
            return (value*0.08 + 30.0);
        }
    }
}
