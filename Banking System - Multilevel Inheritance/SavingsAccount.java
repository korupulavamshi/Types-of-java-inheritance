package Bankingsystem;

class SavingsAccount extends Account {

    private double interestRate;

    void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    void displaySavingsDetails() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
