package Bank;

public class CurrentAccount {

    private String accountHolderName, sortCode, accountNumber;
    private double balance;
    private boolean hasOverDraft;

    public CurrentAccount(String accountHolderName, double balance, boolean hasOverDraft) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.hasOverDraft = hasOverDraft;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        else {
            System.out.println("Add a positive number!");
        }
    }

    public void withdraw (double amount) {
        if (balance > amount) {
            this.balance -= amount;
        }
        else if (hasOverDraft != false) {
            this.balance -= amount;
        }
        else {
            System.out.println("Don't withdraw more than your account!");
        }
    }

    public double getBalance () {
        return this.balance;
    }

    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount("Dan", 100, true);
        ca.withdraw(20);
        System.out.println(ca.getBalance());
    }
}
