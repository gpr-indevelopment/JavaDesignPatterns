package com.example.stateexample;

public class Budget{

    private double value;

    private BudgetState currentState = BudgetState.IN_APPROVAL;

    private boolean discountLock = false;

    public Budget(double value) {
        this.value = value;
    }

    public boolean isDiscountLock() {
        return discountLock;
    }

    public void setDiscountLock(boolean discountLock) {
        this.discountLock = discountLock;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    protected void setCurrentState(BudgetState currentState) {
        this.currentState = currentState;
    }

    public void approve() {
        this.currentState.approve(this);
    }

    public void reprove() {
        this.currentState.reprove(this);
    }

    public void finish() {
        this.currentState.finish(this);
    }

    public void applyDiscount() {
        this.currentState.applyDiscount(this);
    }
}
