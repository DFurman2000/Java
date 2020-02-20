package Bank;

public class StudentAccount {

    private String accountHolderName, sortCode, accountNumber;
    private double balance;
    private double overdraft;

    public StudentAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.overdraft = 500;
    }

    private void deposit(double amount) {
        if (amount < 0) {
            System.out.println("You can't deposit nothing!");
        }
        else {
            this.balance += amount;
        }
    }

    private void withdraw(double amount) {
        if (amount > balance) {
            if (amount < overdraft) {
                System.out.println("There is not enough in your balance to withdraw, so we will withdraw from your overdraft");
                this.overdraft -= amount;
            } else {
                System.out.println("Sorry, you do not have enough in your balance or overdraft");
            }
        }
        else if (amount < balance) {
            this.balance -= amount;
        }
        else {
            System.out.println("You don't have enough in your balance to withdraw!");
        }
    }

    private double getBalance() {
        return this.balance;
    }

    private double getOverdraft() {
        return this.overdraft;
    }

    public static void main(String[] args) {
        StudentAccount sa = new StudentAccount("Dan", 100);
        sa.withdraw(200);

        System.out.println("The balance is now " + sa.getBalance() + " and the overdraft is now " + sa.getOverdraft());
    }
}
