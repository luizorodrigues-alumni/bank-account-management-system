public abstract class BankAccount {
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters
    protected double getBalance(){
        return balance;
    }
    protected double getAccountNumber(){
        return accountNumber;
    }

    // Setters
    protected void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    protected void setBalance(double balance){
        this.balance = balance;
    }

    // Concrete Methods
    protected void deposit(double amount){
        balance += amount;
        System.out.println("Successfully deposited money.");
    }

    protected void displayAccountInfo(){
        System.out.printf("Balance: , %.3f \nAccount Number: %d", balance, accountNumber);
    }

    // Abstract Methods
    abstract void withdraw(double amount);
}
