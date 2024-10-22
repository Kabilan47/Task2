class Account {
   //Create Class Account with data member As Balance
    private double balance;


    public Account() {
        this.balance = 0.0;
    }


    public Account(double initialBalance) {
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }


    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }


    public static void main(String[] args) {

        Account account1 = new Account();
        account1.displayBalance();


        account1.deposit(1000);
        account1.displayBalance();


        account1.withdraw(500);
        account1.displayBalance();


        account1.withdraw(600);

        System.out.println();


        Account account2 = new Account(2000);
        account2.displayBalance();


        account2.deposit(300);
        account2.displayBalance();


        account2.withdraw(250);
        account2.displayBalance();
    }
}
