
class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    BankAccount(String accountHolder, int accountNumber,
                double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException(
                "Initial balance cannot be negative"
            );
        }
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
        } else {
            balance = balance + amount;
            System.out.println("Deposit Successful");
        }
    }
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
        }
    }
    void checkBalance() {
        System.out.println("Final Balance: " + balance);
    }
    void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
    }
}
public class bank_account_tranjection_system{
    public static void main(String[] args) {
        BankAccount account =
            new BankAccount("Rahul", 1001, 5000.0);
        account.displayAccount();
        account.deposit(2000);
        account.withdraw(1500);
        account.checkBalance();
    }
}
