package com.tit.week02.day06.encapsulation.bankingsystem;

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit; // Overdraft limit for current account

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        // Current accounts might not have interest, or have a very low rate
        return getBalance() * 0.5 / 100; // Example interest calculation
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan application for Current Account: $" + loanAmount);
    }

    @Override
    public double calculateLoanEligibility() {
        // Example: Loan eligibility is based on the account balance plus overdraft limit
        return getBalance() + overdraftLimit;
    }
}

