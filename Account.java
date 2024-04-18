public class Account {
    // Data member
    private double balance;
    
    // Constructors
    public Account() {
        // Default constructor with no arguments
        this.balance = 0.0;
    }
    
    public Account(double initialBalance) {
        // Constructor with one argument
        this.balance = initialBalance;
    }
    
    // Method to withdraw balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    
    // Method to deposit balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Updated balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    // Main method to execute the program
    public static void main(String[] args) {
        // Create an Account object with initial balance of 1000
        Account account = new Account(1000);
        
        // Perform withdrawal and deposit operations
        account.withdraw(500);
        account.deposit(200);
    }
}
