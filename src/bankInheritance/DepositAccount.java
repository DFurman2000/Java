package bankInheritance;

public class DepositAccount extends BankAccount{

    private boolean hasInterest;

    public DepositAccount(String accountHolderName, String sortCode, String accountNumber, double balance, boolean hasInterest) {
        super(accountHolderName, sortCode, accountNumber, balance);
        this.hasInterest = hasInterest;
    }

    public static void main(String[] args) {
        DepositAccount da = new DepositAccount("Dan", "123", "1234", 200, true);
        da.withdraw(30);
        System.out.println("Your balance is now " + da.getBalance());
    }

}
