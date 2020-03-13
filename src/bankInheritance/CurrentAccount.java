package bankInheritance;

public class CurrentAccount extends BankAccount {

    private double overdraft;

    public CurrentAccount(String accountHolderName, String sortCode, String accountNumber, double balance, double overdraft) {
        super(accountHolderName, sortCode, accountNumber, balance);
        this.overdraft = overdraft;
    }

    public void withdraw (double amount) {
        if (amount > 0) {
            if (amount < overdraft + getBalance()) {
                //System.out.println("There is not enough in your balance to withdraw, so we will withdraw from your overdraft");
            } else {
                System.out.println("Sorry, you do not have enough in your balance or overdraft");
            }
        }
        else {
            System.out.println("Cannot withdraw a negative number");
        }
    }

    public double getOverdraft() {
        return this.overdraft;
    }

    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount("Dan", "123", "123", 100, 1000);
        // ca.deposit(20);
        // System.out.println("The balance is now £" + ca.getBalance() + " and the overdraft is now £" + ca.getOverdraft());
        ca.withdraw(100);
        System.out.println(ca.getBalance());
    }
}
