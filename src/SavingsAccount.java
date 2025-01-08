public class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        if(checkAllowedWithdraw(amount)){
            setBalance(getBalance() - amount);
            System.out.println("Money Withdrawn Successfully! ");
        }
        else {
            System.out.println("You cannot withdraw the money. Insufficient balance");
        }
    }

    boolean checkAllowedWithdraw(double amount){
        return amount <= getBalance();
    }
}
