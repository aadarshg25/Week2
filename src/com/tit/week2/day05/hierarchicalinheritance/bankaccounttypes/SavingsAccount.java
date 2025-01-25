package com.tit.week2.day05.hierarchicalinheritance.bankaccounttypes;

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        displayAccountType();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}
