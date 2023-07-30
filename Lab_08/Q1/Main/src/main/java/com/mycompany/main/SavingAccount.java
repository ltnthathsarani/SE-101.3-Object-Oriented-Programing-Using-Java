package com.mycompany.main;
class SavingsAccount extends BankAccount
{
    public SavingsAccount(String accountNumber, double balance) 
    {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        double interestRate = 0.12; 
    // 12% interest rate for Savings Account
        return getBalance() * interestRate;
    }
}


