import java.util.ArrayList;
import java.util.List;

public class BankService {
    private InputUtils inputUtils;
    private List<BankAccount> bankAccounts = new ArrayList<>();

    //Constructor
    public BankService(){
        this.inputUtils = new InputUtils();
    }

    public void createAccount(){
        System.out.println("Please, enter an account type (1 or 2).");
        System.out.println("1: Savings Account");
        System.out.println("2: Current Account");

        // Reads the user input
        int accountOption = inputUtils.readInt();

        System.out.println("Please, enter an account number: ");
        int accountNumber = inputUtils.readInt();

        switch (accountOption){
            case 1:
                bankAccounts.add(new SavingsAccount(accountNumber,0));
                System.out.println("Your Savings account has been created successfully!");
                break;
            case 2:
                bankAccounts.add(new CurrentAccount(accountNumber, 0));
                System.out.println("Your Current account has been created successfully!");
                break;
        }
    }
    public BankAccount findAccountByNumber(){
        System.out.println("Please, enter your account number: ");
        int accountNumber = inputUtils.readInt();
        for(BankAccount account:bankAccounts){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        System.out.println("Account not Found.");
        return null;
    }

    public void depositMoney(){
        BankAccount account = findAccountByNumber();
        if(account != null){
            System.out.println("Please, enter the amount: ");
            double amount = inputUtils.readDouble();
            account.deposit(amount);
        }
    }

    public void withdrawMoney(){
        BankAccount account = findAccountByNumber();
        if(account != null){
            System.out.println("Please enter the amount: ");
            double amount = inputUtils.readDouble();
            account.withdraw(amount);
        }
    }

    public void getBalance(){
        BankAccount account = findAccountByNumber();
        if(account != null){
            System.out.println("Your balance: " + account.getBalance());
        }
    }
}
