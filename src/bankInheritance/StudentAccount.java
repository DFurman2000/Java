package bankInheritance;

public class StudentAccount extends BankAccount{

    private double overdraft;

    public StudentAccount(String accountHolderName, String sortCode, String accountNumber, double balance) {
        super(accountHolderName, sortCode, accountNumber, balance);
        this.overdraft = 500;
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

    public double getOverdraft(){
        return this.overdraft;
    }

    public static void main(String[] args) {
        StudentAccount sa = new StudentAccount("Dan", "123", "1101", 200);

        System.out.println("You can withdraw up to £" + (sa.balance + sa.overdraft));

        sa.withdraw(650);
        System.out.println("Balance is now " + sa.getBalance());
    }
}
