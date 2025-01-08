public class CurrentAccount extends BankAccount {
    // Negative limit
    private double negativeLimit = -100;

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void setNegativeLimit(double negativeLimit){
        this.negativeLimit = negativeLimit;
    }

    @Override
    void withdraw(double amount) {
        if (checkAllowedWithdraw(amount)){
            setBalance(getBalance() - amount);
            System.out.println("Money Withdrawn Successfully! ");
        }
        else {
            System.out.println("You cannot withdraw the money. Insufficient Negative Limit.");
        }
    }

    boolean checkAllowedWithdraw(double amount){
        return ((getBalance() - amount) >= negativeLimit);
    }
}
