package com.tit.week2.day05.hierarchicalinheritance.bankaccounttypes;

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        displayAccountType();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}
