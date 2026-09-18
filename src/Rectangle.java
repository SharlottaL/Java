public record Rectangle(double width, double height) implements Shape
{
    public Rectangle {
       if (width <= 0 || height <= 0) throw new IllegalArgumentException();
    }
    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }


    public static Rectangle square(double side) {
        return new Rectangle(side, side);
    }
}
