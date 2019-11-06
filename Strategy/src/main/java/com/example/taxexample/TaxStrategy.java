package com.example.taxexample;

public enum TaxStrategy implements Tax {

    ICCC {
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
    },
    ICMS{
        @Override
        public double calculate(Budget budget) {
            return (budget.getValue()*0.05 + 50.0);
        }
    },
    ISS{
        @Override
        public double calculate(Budget budget) {
            return budget.getValue()*0.06;
        }
    };
}
