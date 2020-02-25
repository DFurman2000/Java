package bankInheritance;

import java.util.Scanner;

public class BankAccount {

    private String accountHolderName, sortCode, accountNumber;
    public double balance;

    public BankAccount(String accountHolderName, String sortCode, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount() {
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            System.out.println("You have deposited £" + amount);
            this.balance += amount;
        }
        else {
            System.out.println("Add a positive number!");
        }
    }

    public void withdraw (double am) {
        if (balance > am) {
            this.balance -= am;
            System.out.println("You have withdrawn £" + am);
        }
        else {
            System.out.println("Don't withdraw more than your account!");
        }
    }
}

// Next I want to let the user input the amount they want to withdraw/deposit from
// and let them choose if they wish to withdraw from the bank account or overdraft.