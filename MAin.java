import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accHolderName;
    double balance;

    BankAccount(int accountNumber, String accHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    public void deposit(Scanner sc) {
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextLong();
        balance = balance + amt;
        System.out.println("Balance after deposit: " + balance);
    }

    public void withdrawal(Scanner sc) {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
        }
    }
}

public class MAin {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(9876, "Shah Mubin Al Noman", 5000);
        System.out.println(account.accountNumber);
        System.out.println(account.accHolderName);
        System.out.println(account.balance);

        Scanner scanner = new Scanner(System.in);
        account.deposit(scanner);
        account.withdrawal(scanner);

        scanner.close();
    }
}
