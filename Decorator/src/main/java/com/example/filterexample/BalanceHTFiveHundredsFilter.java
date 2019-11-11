package com.example.filterexample;

import java.util.function.Predicate;

public class BalanceHTFiveHundredsFilter extends Filter{

    public BalanceHTFiveHundredsFilter(Filter nextFilter) {
        super(nextFilter);
    }

    public BalanceHTFiveHundredsFilter() {
    }

    @Override
    protected Predicate<Account> accountFilterPredicate() {
        return (account -> account.getBalance() > 500);
    }
}
