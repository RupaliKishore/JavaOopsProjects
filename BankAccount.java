class BankAccount 
{

    // Private Variable (hiddens)
    private String accountHolder;
    private double balance;

    // Constructor ( for bank account )
    public BankAccount(String accountHolder, double balance)
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter - balance  for show on display
    public double getBalance()
    {
        return balance;
    }

    // setter - for deposit money
    public double deposit(double amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
            System.out.println("Deposites: " + amount);

        }
        return amount;
    } 

    // for Withraw

    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawn: "+ amount);
        }
        else 
        {
            System.out.println("Insufficient balance!");
        }

    }

    // Show account info
    public void displayInfo()
    {
        System.out.println("Account Holde: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

}