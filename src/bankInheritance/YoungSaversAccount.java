package bankInheritance;

public class YoungSaversAccount extends BankAccount{

    private boolean hasInterest;

    public YoungSaversAccount(String accountHolderName, String sortCode, String accountNumber, double balance, boolean hasInterest) {
        super(accountHolderName, sortCode, accountNumber, balance);
        this.hasInterest = hasInterest;
    }

    public double getBalance() {
        if (super.getBalance() > 100) {
            System.out.println("You are trying to deposit more than the balance limit (£100.) Please try again.");
        } else {
            return super.getBalance();
        }
        return 0;
    }

    public static void main(String[] args) {
        YoungSaversAccount ysa = new YoungSaversAccount("Dan", "123", "1234", 90, false);
        ysa.deposit(50);

        System.out.println("Your balance is now £" + ysa.getBalance());
    }
}
