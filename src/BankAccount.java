public class BankAccount {
    private String owner;
    private double balance;
    public BankAccount(String owner, double balance)
    {
        this.balance = balance;
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        if (amount <= 0)
        {
            System.out.println("Сумма должна быть > 0");
            return;
        }
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
    public double calculateYearlyReport()
    {
        return balance;
    }
    public void printInfo()
    {
        System.out.println("Owner: " + owner + ", balance: " + balance);
    }
}
