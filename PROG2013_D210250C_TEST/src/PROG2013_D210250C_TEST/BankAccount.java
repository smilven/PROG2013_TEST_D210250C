package PROG2013_D210250C_TEST;

/**
 *
 * @author Mii si heng 
*/
public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String accountHolderName;

    public BankAccount(int accountNumber, double accountBalance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }

    public void withdraw(double amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("accountBalance: " + accountBalance);
    }
}

