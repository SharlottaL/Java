public class Circle implements Drawable {
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
//    @Override
//    public double area() {
//        return Math.PI * radius * radius;
//    }

    @Override
    public void draw() {
        System.out.println("Radius " + radius);
    }
}
