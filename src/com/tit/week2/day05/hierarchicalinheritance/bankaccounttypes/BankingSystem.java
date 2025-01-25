package com.tit.week2.day05.hierarchicalinheritance.bankaccounttypes;

class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA12345", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA67890", 2000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD11223", 10000.0, 12);

        savings.displayDetails();
        System.out.println();
        checking.displayDetails();
        System.out.println();
        fixedDeposit.displayDetails();
    }
}
