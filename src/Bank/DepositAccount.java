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


}
