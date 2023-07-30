package com.mycompany.main;
class CheckingAccount extends BankAccount 
{
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        double interestRate = 0.02; // 2% interest rate for Checking Account
        return getBalance() * interestRate;
    }
}