package bankInheritance;

public class CurrentAccount extends BankAccount {

    private double overdraft;

    public CurrentAccount(String accountHolderName, String sortCode, String accountNumber, double balance, double overdraft) {
        super(accountHolderName, sortCode, accountNumber, balance);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw (double amount) {
        if (balance > amount) {
            this.balance -= amount;
            System.out.println("You have withdrawn £" + amount);
        }
        else if (amount < overdraft + getBalance()) {
            System.out.println("This will go into your overdraft because you do not have enough within your balance");
            this.balance -= amount;
            System.out.println("You have withdrawn £" + amount);
        }
        else {
            System.out.println("Sorry, you do not have enough in your balance or overdraft");
        }
    }

    public double getOverdraft() {
        return this.overdraft;
    }


    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount("Dan", "123", "123", 100, 1000);

        System.out.println("You can withdraw up to £" + (ca.balance + ca.overdraft));

        ca.withdraw(1000);
        System.out.println("Your balance is now " + ca.getBalance());
    }
}
