public class BankAccountManagementSystem {
    public static void main(String[] args) {

        BankService bankService = new BankService();
        InputUtils inputUtils = new InputUtils();
        boolean exit = false;

        System.out.println("Welcome to the Simple Bank Account Management System! What would you like to do?");
        while (!exit){
            System.out.println("-------------------------------");
            System.out.print(" 1: Create an Account \n 2: Deposit Money \n 3: Withdraw Money \n 4: Get Balance \n 5: Exit \n");
            int choice = inputUtils.readInt();
            System.out.println("-------------------------------");
            switch (choice){
                case 1:
                    bankService.createAccount();
                    break;
                case 2:
                    bankService.depositMoney();
                    break;
                case 3:
                    bankService.withdrawMoney();
                    break;
                case 4:
                    bankService.getBalance();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid Choice, please try again.");
            }
        }
    }
}