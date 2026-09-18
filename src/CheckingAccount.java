public class CheckingAccount extends BankAccount{
    private double overdraftFee;
    public CheckingAccount(String owner, double balance, double overdraftFee)
    {
        super(owner, balance);
        this.overdraftFee = overdraftFee;
    }
    @Override
    public double calculateYearlyReport() {
        return getBalance() - overdraftFee;
    }
}
