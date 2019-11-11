package com.example.filterexample;

import java.util.Date;
import java.util.function.Predicate;

public class CurrentMonthCreationDateFilter extends Filter{

    public CurrentMonthCreationDateFilter(Filter nextFilter) {
        super(nextFilter);
    }

    public CurrentMonthCreationDateFilter() {
    }

    @Override
    protected Predicate<Account> accountFilterPredicate() {
        return (account -> account.getCreationDate().getMonth() == new Date().getMonth());
    }
}
