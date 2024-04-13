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
    }

