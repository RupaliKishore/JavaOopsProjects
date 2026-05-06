class Main 
{
    public static void main(String[] args)
    {
        System.out.println(" =========== My First Oop Program =========  \n");

        // create Bank Account
        BankAccount myAccount = new BankAccount("Rupali", 1000);


        // show Account Info
        myAccount.displayInfo();

        System.out.println("\n -------- Doing Transaction --------");

        // Adding Money
        myAccount.deposit(500);

        // withdraw money
        myAccount.withdraw(200);

        // show Final balance
        System.out.println("\n Total Balance: "+ myAccount.getBalance());

        
    }
}