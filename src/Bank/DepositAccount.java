package Bank;

public class DepositAccount {

    private String accountHolderName, sortCode, accountNumber;
    private double balance;
    private boolean hasInterest;

    public DepositAccount(String accountHolderName, double balance, boolean hasInterest) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.hasInterest = hasInterest;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        else {
            System.out.println("Please enter an amount greater than 0");
        }
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            this.balance -= amount;
        }
        else {
            System.out.println("Don't withdraw more than you own!");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        DepositAccount da = new DepositAccount("Dan", 50, true);
        da.withdraw(30);
        System.out.println("Your balance is now " + da.getBalance());
    }

}
