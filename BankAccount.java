public class BankAccount {

    private double balance;
    private String pin;

    // Constructor
    public BankAccount(String p) {
        pin = p;
        balance = 0;
        System.out.println("Account created");
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount");
        }
    }

    // Getter method for balance (with PIN check)
    public double getBalance(String enteredPin) {
        if (enteredPin.equals(pin)) {
            return balance;
        } else {
            System.out.println("Incorrect Pin!");
            return -1;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        BankAccount account = new BankAccount("162004");

        account.deposit(10000);

        System.out.println("Balance: " + account.getBalance("162004"));

        account.withdraw(2500);

        System.out.println("Balance after withdraw: " + account.getBalance("162004"));
    }
}

