package com.tit.week2.day05.hierarchicalinheritance.bankaccounttypes;

class FixedDepositAccount extends BankAccount {
    int duration; // in months

    public FixedDepositAccount(String accountNumber, double balance, int duration) {
        super(accountNumber, balance);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        displayAccountType();
        System.out.println("Duration: " + duration + " months");
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
