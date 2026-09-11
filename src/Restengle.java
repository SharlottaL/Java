public class Restengle extends Shape {
    double width;
    double height;
  public Restengle(char type, double width, double height)
  {
      super(type);
      this.height = height;
      this.width = width;
  }
    @Override
    public double area() {
        return width * height;
    }
}
