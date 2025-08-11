import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class BankAccount {
    private final String accountNumber = "38761563829";
    private final String accountHolderName = "Manoj Kumar";
    private final String BankName = "SBI";
    private double balance;
    private final double MIN_BALANCE = 500;
    private ArrayList<String> transactionHistory;

    public BankAccount(double initialDeposit) {
        if (initialDeposit < MIN_BALANCE) {
            System.out.println("Initial deposit must be at least Rs." + MIN_BALANCE);
            System.exit(0);
        }
        
        this.balance = initialDeposit;
        this.transactionHistory = new ArrayList<>();
        logTransaction("Account created with initial deposit: Rs." + initialDeposit);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            logTransaction("Deposited Rs." + amount);
            showBalance();
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
            logTransaction("Withdrew Rs." + amount);
            showBalance();
        } else {
            System.out.println("Withdrawal denied. Maintain minimum balance of Rs." + MIN_BALANCE);
        }
    }

    public void showBalance() {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("[" + timestamp + "] Current Balance: Rs." + balance);
    }

   public void printTransactionHistory() {
    System.out.println("\nTransaction History for " + accountHolderName + ":");
    for (String transaction : transactionHistory) {
        System.out.println(transaction);
    }
    String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    System.out.println("\n[" + timestamp + "] Total Available Balance: Rs." + balance);
}

    private void logTransaction(String detail) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        transactionHistory.add(timestamp + " - " + detail);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getBankName(){
        return BankName;
    }
}

public class BankAccountSimulation {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Welcome Manoj Kumar Pinniboina.. ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("AccountNo:38761563829");
        System.out.println("State Bank of India");
        System.out.println("IFSC:SBIN0021202");
        System.out.println("-----------------------------------------------------------------------------");

        BankAccount account = new BankAccount(500); // Fixed initial deposit

        int choice;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Transaction History\n4. Close");
            System.out.print("Choose an operation to perform: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: RS.");
                    double dep = scanner.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: Rs.");
                    double wd = scanner.nextDouble();
                    account.withdraw(wd);
                    break;
                case 3:
                    account.printTransactionHistory();
                    break;
                case 4:
                    System.out.println("Thank you, " + account.getAccountHolderName() + "!");
                    break;
                default:
                    System.out.println("Invalid operation.");
            }
        } while (choice != 4);
    }
}