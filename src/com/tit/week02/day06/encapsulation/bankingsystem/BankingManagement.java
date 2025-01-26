package com.tit.week02.day06.encapsulation.bankingsystem;

import java.util.ArrayList;
import java.util.List;

class BankingManagement {
    public static void main(String[] args) {
        // Create a list of bank accounts
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SA123", "Alice", 5000.0, 5.0)); // 5% interest rate
        accounts.add(new CurrentAccount("CA456", "Bob", 3000.0, 2000.0)); // Overdraft limit of 2000

        // Demonstrating polymorphism
        for (BankAccount account : accounts) {
            System.out.println("\nAccount Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Current Balance: $" + account.getBalance());
            System.out.println("Interest: $" + account.calculateInterest());

            // Loan application and eligibility
            if (account instanceof Loanable) {
                Loanable loanAccount = (Loanable) account;
                loanAccount.applyForLoan(10000.0);
                System.out.println("Loan Eligibility: $" + loanAccount.calculateLoanEligibility());
            }
        }
    }
}

