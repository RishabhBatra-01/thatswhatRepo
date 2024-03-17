package backend;

public class BankAccount {
    public String accountHolder;
    public double balance;

    public BankAccount(){

    }
    public BankAccount(String holder, double initialBalance) {
        accountHolder = holder;
        balance = initialBalance;
    }

    public static void main(String[] args) {
        // Example usage without encapsulation
        BankAccount myAccount = new BankAccount("John Doe", 1000);

        System.out.println("Initial balance: $" + myAccount.balance);


        BankAccount obj = new BankAccount();

        obj.balance = -500; // Direct access to balance, violating constraints
        System.out.println("After direct modification: $" + myAccount.balance);
    }
}

