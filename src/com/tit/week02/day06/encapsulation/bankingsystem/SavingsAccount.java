package com.tit.week02.day06.encapsulation.bankingsystem;

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // Specific interest rate for savings account

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan application for Savings Account: $" + loanAmount);
    }

    @Override
    public double calculateLoanEligibility() {
        // Example: Loan eligibility is 2 times the account balance
        return getBalance() * 2;
    }
}

