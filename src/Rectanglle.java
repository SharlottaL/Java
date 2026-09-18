public class Rectanglle extends ShapeC{
    private double width;
    private double height;
    public Rectanglle(String name, double width, double height)
    {
        super(name);
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;
    }
}
