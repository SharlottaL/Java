public class ShapeC {
    private String name;
    public ShapeC(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double area()
    {
        return 0;
    }
    public void describe()
    {
        System.out.println("name: " + name + " area " + area());
    }
}
