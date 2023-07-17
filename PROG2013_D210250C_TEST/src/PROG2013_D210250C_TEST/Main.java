package PROG2013_D210250C_TEST;


public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(12223, 5000, "MII SI HENG", 3.0);
        savingsAccount.displayAccountInfo();
        savingsAccount.addInterest();
        savingsAccount.displayAccountInfo();

        CurrentAccount currentAccount = new CurrentAccount(12222, 200, "MII SI HENG", 1000);
        currentAccount.displayAccountInfo();
        currentAccount.withdraw(400);
        currentAccount.displayAccountInfo();
    }
}
