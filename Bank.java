class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

class AccountHolder {
    private int accountNumber;
    private String accountHolderName;
    private double depositedMoney;

    public AccountHolder(int accountNumber, String accountHolderName, double depositedMoney) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.depositedMoney = depositedMoney;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getDepositedMoney() {
        return depositedMoney;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(12345, "John Doe", 1000.0);
        AccountHolder accountHolder = new AccountHolder(bankAccount.getAccountNumber(), bankAccount.getAccountHolderName(), bankAccount.getBalance());

        System.out.println("Account Number: " + accountHolder.getAccountNumber());
        System.out.println("Account Holder Name: " + accountHolder.getAccountHolderName());
        System.out.println("Deposited Money: $" + accountHolder.getDepositedMoney());
    }
}
