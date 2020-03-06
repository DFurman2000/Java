package bankInheritance;

import java.util.ArrayList;

public class Bank {

    private String bankName;

    public void printBankList() {
        final String formatString = "%-18s, %4s, %12s, %16s, %20d, %24d, %28b, %32d";
    }

    public static void main(String[] args) {
        ArrayList<BankAccount> bankList = new ArrayList<>();
        bankInheritance.CurrentAccount ca = new CurrentAccount("Dan", "123", "123", 500, 1000);
        DepositAccount da = new DepositAccount("Dan", "123", "123", 500, true);
        StudentAccount sa = new StudentAccount("Dan", "123", "123", 200);
        YoungSaversAccount ysa = new YoungSaversAccount("Dan", "123", "1234", 90, false);
        bankList.add(ca);
        bankList.add(da);
        bankList.add(sa);
        bankList.add(ysa);

        for (BankAccount b : bankList) {
            System.out.println("Account Holder Name: " + b.getAccountHolderName() + " Sort Code: " + b.getSortCode() +
                    " Account Number: " + b.getAccountNumber() + " Balance: £" + b.getBalance());
        };
        System.out.println("Total Balance: £" + (ca.balance + da.balance + sa.balance + ysa.balance));
    }

}
