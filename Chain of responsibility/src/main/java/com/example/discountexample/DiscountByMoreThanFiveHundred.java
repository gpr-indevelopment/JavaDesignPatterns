package com.example.discountexample;

public class DiscountByMoreThanFiveHundred implements Discount{

    private Discount next;

    public double discount(Budget budget){
        if(budget.getValue() > 500.0){
            return budget.getValue() * 0.07;
        }
        else {
            return next.discount(budget);
        }
    }

    @Override
    public void setNext(Discount discount) {
        this.next = discount;
    }
}
