package com.example.stateexample;

public enum BudgetState implements BudgetDiscount, BudgetStatusNetwork{
    IN_APPROVAL{
        @Override
        public void applyDiscount(Budget budget) {
            if(!budget.isDiscountLock()){
                budget.setValue(budget.getValue()*0.95);
                budget.setDiscountLock(true);
            }
        }

        @Override
        public void approve(Budget budget) {
            budget.setCurrentState(BudgetState.APPROVED);
        }

        @Override
        public void reprove(Budget budget) {
            budget.setCurrentState(BudgetState.REPROVED);
        }

        @Override
        public void finish(Budget budget) {
            throw new RuntimeException("Budget is in approval. It cannot be finalized.");
        }
    }, APPROVED{
        @Override
        public void applyDiscount(Budget budget) {
            if(!budget.isDiscountLock()){
                budget.setValue(budget.getValue()*0.98);
                budget.setDiscountLock(true);
            }
        }

        @Override
        public void approve(Budget budget) {
            throw new RuntimeException("Budget is already approved.");
        }

        @Override
        public void reprove(Budget budget) {
            throw new RuntimeException("You cannot reprove an approved budget.");
        }

        @Override
        public void finish(Budget budget) {
            budget.setCurrentState(BudgetState.FINISHED);
        }
    }, REPROVED{
        @Override
        public void applyDiscount(Budget budget) {

        }

        @Override
        public void approve(Budget budget) {
            throw new RuntimeException("You cannot approve a reproved Budget.");
        }

        @Override
        public void reprove(Budget budget) {
            throw new RuntimeException("This budget was already reproved.");
        }

        @Override
        public void finish(Budget budget) {
            budget.setCurrentState(BudgetState.FINISHED);
        }
    }, FINISHED{
        @Override
        public void applyDiscount(Budget budget) {

        }

        @Override
        public void approve(Budget budget) {
            throw new RuntimeException("This budget is finished.");
        }

        @Override
        public void reprove(Budget budget) {
            throw new RuntimeException("This budget is finished.");
        }

        @Override
        public void finish(Budget budget) {
            throw new RuntimeException("This budget is finished.");
        }
    }
}
