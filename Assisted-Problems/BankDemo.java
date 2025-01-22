import java.util.ArrayList;

class Bank {
    private String name;
    private ArrayList<Customer> customers;

    Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Method to open a new account for a customer with an initial balance
    public void openAccount(Customer customer, double initialBalance) {
        Account newAccount = new Account(this, initialBalance);
        customer.addAccount(newAccount); // Link the new account to the customer
        customers.add(customer); // Add customer to the bank's customer list
    }

    public String getName() {
        return name;
    }
}

// Customer class representing a bank customer
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Add a new account to the customer's account list
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // View balance for all accounts associated with the customer
    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account account : accounts) {
            System.out.println("Balance: " + account.getBalance() + " in Bank: " + account.getBank().getName());
        }
    }
}

class Account {
    private Bank bank;
    private double balance;

    Account(Bank bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        // Creating bank objects
        Bank bank1 = new Bank("National Bank");
        Bank bank2 = new Bank("City Bank");

        // Creating customer objects
        Customer customer1 = new Customer("Aditya");
        Customer customer2 = new Customer("Aadarsh");

        // Opening accounts for customers in different banks
        bank1.openAccount(customer1, 5000);
        bank1.openAccount(customer2, 3000);
        bank2.openAccount(customer1, 7000);

        // Viewing balance for each customer
        customer1.viewBalance();
        customer2.viewBalance();
    }
}