package Bankingsystem;

class Account {

    private String accountHolder;
    private double balance;

    void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
