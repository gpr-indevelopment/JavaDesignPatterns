package com.example.discountexample;

public class DiscountByFiveItems implements Discount{

    private Discount next;

    public double discount(Budget budget){
        if(budget.getItems().size() > 5){
            return budget.getValue()*0.1;
        }
        else{
            return next.discount(budget);
        }
    }

    @Override
    public void setNext(Discount discount) {
        this.next = discount;
    }
}
