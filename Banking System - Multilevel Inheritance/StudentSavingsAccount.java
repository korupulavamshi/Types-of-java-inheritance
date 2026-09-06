package Bankingsystem;

class StudentSavingsAccount extends SavingsAccount {

    private double discount;

    void setDiscount(double discount) {
        this.discount = discount;
    }

    void displayStudentSavingsDetails() {
        System.out.println("Student Discount: " + discount + "%");
    }
}
