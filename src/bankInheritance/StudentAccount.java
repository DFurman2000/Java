package bankInheritance;

public class StudentAccount extends BankAccount{

    private double overdraft;

    public StudentAccount(String accountHolderName, String sortCode, String accountNumber, double balance) {
        super(accountHolderName, sortCode, accountNumber, balance);
        this.overdraft = 500;
    }

    public void withdraw(double amount) {
        if (amount > super.getBalance()) {
            if (amount < overdraft) {
                System.out.println("There is not enough in your balance to withdraw, so we will withdraw from your overdraft");
                this.overdraft -= amount;
            } else {
                System.out.println("Sorry, you do not have enough in your balance or overdraft");
            }
        }
    }

    public double getOverdraft(){
        return this.overdraft;
    }

    public static void main(String[] args) {
        StudentAccount sa = new StudentAccount("Dan", "123", "1101", 200);
        sa.withdraw(200);

        System.out.println("The balance is now " + sa.getBalance() + " and the overdraft is now " + sa.getOverdraft());
    }
}
