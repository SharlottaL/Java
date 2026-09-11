public class BankAccount {
    String owner;
    double balance;
    public BankAccount(String owner, double balance)
    {
        this.balance = balance;
        this.owner = owner;
    }
    public void deposit(double amount)
    {
     balance += amount;
    }
    public void withdraw(double amount)
    {
        if(balance < amount) {
            System.out.println("Недостаточно средств");
        }
        else {
            balance -= amount;
        }
    }
    public void printInfo()
    {
        System.out.println("Owner: " + owner + ", balance: " + balance);
    }
}
