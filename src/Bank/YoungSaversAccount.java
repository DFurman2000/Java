package Bank;

public class YoungSaversAccount {

    private String accountHolderName, sortCode, accountNumber;
    private double balance;
    private boolean hasInterest;

    public YoungSaversAccount(String accountHolderName, double balance, boolean hasInterest) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.hasInterest = hasInterest;
    }

    private void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Sorry, you cannot deposit less than £0");
        }
        else {
            this.balance += amount;
        }
    }

    private void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("You don't have enough in the balance to withdraw");
        }
        else {
            this.balance -= amount;
        }
    }

    private double getBalance() {
        if (balance > 100) {
            System.out.println("You are trying to deposit more than the balance limit (100.) Please try again.");
        }
        else {
            return this.balance;
        }
        return 0;
    }

    public static void main(String[] args) {
        YoungSaversAccount ysa = new YoungSaversAccount("Dan", 90, true);
        ysa.deposit(5);

        System.out.println(ysa.getBalance());
    }
}
