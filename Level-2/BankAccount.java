import java.util.Scanner;

class BankAccountDetails {
    private String accountHolder;
    private int accountNumber;
    private int balance;

    // Constructor
    BankAccountDetails(String accountHolder, int accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void depositMoney(int money) {
        if (money > 0) {
            balance += money;
            System.out.println("Successfully deposited " + money);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // Method to withdraw money
    public void withdrawMoney(int money) {
        if (money > 0) {
            if (balance >= money) {
                balance -= money;
                System.out.println("Successfully withdrew " + money);
            } else {
                System.out.println("Insufficient Balance!");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
    }

    // Method to display the current balance
    public void displayCurrentBalance() {
        System.out.println("Your Current Balance is: " + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Account Holder Name: ");
        String accountHolder = input.nextLine();

        System.out.print("Enter the Account Number: ");
        int accountNumber = input.nextInt();

        System.out.print("Enter the Initial Balance: ");
        int balance = input.nextInt();

        BankAccountDetails person = new BankAccountDetails(accountHolder, accountNumber, balance);

        // Ask user to deposit money
        System.out.print("Do you want to deposit money (y/n): ");
        char response = input.next().toLowerCase().charAt(0);
        if (response == 'y') {
            System.out.print("Enter the amount you wish to deposit: ");
            int money = input.nextInt();
            person.depositMoney(money);
        }

        // Ask user to withdraw money
        System.out.print("Do you want to withdraw money (y/n): ");
        response = input.next().toLowerCase().charAt(0);
        if (response == 'y') {
            System.out.print("Enter the amount you wish to withdraw: ");
            int money = input.nextInt();
            person.withdrawMoney(money);
        }

        person.displayCurrentBalance();

        input.close();
    }
}
