public class Developer extends Employee {
    public Developer(String name, double baseSalary) {
        super(name,baseSalary);
    }
    @Override
    double calculatePay()
    {
        return super.calculatePay() + 15000;
    }
}
