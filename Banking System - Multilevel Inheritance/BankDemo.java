package Bankingsystem;

import java.util.Scanner;

public class BankDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentSavingsAccount account = new StudentSavingsAccount();

        System.out.print("Enter Account Holder Name: ");
        account.setAccountHolder(sc.nextLine());

        System.out.print("Enter Balance: ");
        account.setBalance(sc.nextDouble());

        System.out.print("Enter Interest Rate: ");
        account.setInterestRate(sc.nextDouble());

        System.out.print("Enter Student Discount: ");
        account.setDiscount(sc.nextDouble());

        System.out.println("\n--- Account Details ---");

        account.displayAccountDetails();
        account.displaySavingsDetails();
        account.displayStudentSavingsDetails();

        sc.close();
    }
}
