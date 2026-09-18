public class Student extends Person{
    private double grade;
    public Student(String name, int age, double grade)
    {
        super(name, age);
        setGrade(grade);
    }
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade < 0 || grade > 10)
        {
            System.out.println("Оценка должна быть 0–10");
            return;
        }
        this.grade = grade;
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Оценка: "+ grade);
    }
}
