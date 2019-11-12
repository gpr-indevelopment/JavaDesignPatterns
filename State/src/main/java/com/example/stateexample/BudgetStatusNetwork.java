package com.example.stateexample;

public interface BudgetStatusNetwork {

    void approve(Budget budget);

    void reprove(Budget budget);

    void finish(Budget budget);
}
