class BankAccount {

    static String bankName = "SBI";
    static int numberofAccounts = 0;

    private String accountHolderName;

    private final long accountNumber;

    // parameterized constructor
    BankAccount(String accountHolderName, long accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        numberofAccounts++;
    }

    // Account Details
    void accountDetails() {
        if (this instanceof BankAccount) {
            System.out.println(
                    accountHolderName + " has a account in " + bankName + " having account number " + accountNumber);
            System.out.println();
        } else {
            System.out.println("Invalid account!");
        }

    }

    // To get total number of accounts
    static int getTotalAccounts() {
        return numberofAccounts;
    }
}

public class BankAccountSystem {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Harry", 6446);
        BankAccount account2 = new BankAccount("Brook", 84156);

        account1.accountDetails();
        account2.accountDetails();

        System.out.println(
                "Total number of accounts in " + BankAccount.bankName + " is " + BankAccount.getTotalAccounts());

    }
}