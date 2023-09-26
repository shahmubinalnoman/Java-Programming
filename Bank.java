class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accNumber, String accHolderName, double initialDeposit) {
        accountNumber = accNumber;
        accountHolderName = accHolderName;
        balance = initialDeposit;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345, "Shah Mubin Al Noman", 1000.0);

        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Account Holder Name: " + account.accountHolderName);
        System.out.println("Balance: $" + account.balance);
    }
}
