/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG2013_D210250C_TEST;

/**
 *
 * @author Mii si heng
 */
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double accountBalance, String accountHolderName, double overdraftLimit) {
        super(accountNumber, accountBalance, accountHolderName);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (getAccountBalance() + overdraftLimit >= amount) {
            if (getAccountBalance() >= amount) {
                super.withdraw(amount);
            } else {
                double overdraftAmount = amount - getAccountBalance();
                double charge = overdraftAmount * 0.03;
                super.withdraw(getAccountBalance());
                overdraftLimit -= (overdraftAmount + charge);
                System.out.println("Overdraft amount: " + overdraftAmount);
                System.out.println("Charge RM: " + charge+ " as 0.03 rate");
            }
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}


