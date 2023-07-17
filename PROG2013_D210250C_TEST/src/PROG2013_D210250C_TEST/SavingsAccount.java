/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG2013_D210250C_TEST;

/**
 *
 * @author Mii si heng
 */
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, double accountBalance, String accountHolderName, double interestRate) {
        super(accountNumber, accountBalance, accountHolderName);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getAccountBalance() * (interestRate / 100);
    }

    public void addInterest() {
        double interest = calculateInterest();
        deposit(interest);
        
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
