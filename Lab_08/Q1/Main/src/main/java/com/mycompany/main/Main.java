package com.mycompany.main;
public class Main 
{
    public static void main(String[] args) {
        double checkingBalance = 1000000; 
        // 1 million in the checking account
        double savingBalance = 20000000; 
        // 20 million in the saving account

        CheckingAccount checkingAccount = new CheckingAccount("1234", checkingBalance);
        SavingsAccount savingAccount = new SavingsAccount("5678", savingBalance);

        double checkingInterest = checkingAccount.calculateInterest();
        double savingInterest = savingAccount.calculateInterest();

        System.out.printf("Interest on Checking Account: $%.2f%n", checkingInterest);
        System.out.printf("Interest on Savings Account: $%.2f%n", savingInterest);
    }
}