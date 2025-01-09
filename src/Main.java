import model.Account;
import model.CreditAccount;
import model.SavingAccount;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        Account savingAccount = new SavingAccount("Seyla");
        while (!exit)
        {
            System.out.println("\nChoose an action:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Convert to KHR(riel-៛)");
            System.out.println("5. Show Balance in USD(Dollar-$)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            // Create saving account name seyla
            int choice = scanner.nextInt();
            scanner.nextLine();

            // login prompt
            System.out.print("\nPlease login to continue.\nEnter email: ");
            String email = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            if (savingAccount.login(email, password))
            {
                switch (choice)
                {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        savingAccount.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        savingAccount.withdraw(withdrawAmount);
                        break;
                    case 3:
                        savingAccount.showBalance();
                        break;
                    case 4:
                        savingAccount.getKHCurrency();
                        break;
                    case 5:
                        savingAccount.getDollarCurrency();
                        break;
                    case 6:
                        System.out.println("Thank you for using the Banking Application. Goodbye!");
                        exit = true;
                        break;
                }

            }
        }
    }
}
