import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    //1)
// Book bookF = new Book("Martin Eden", 448);
// Book bookS = new Book("Towards Zero", 242);
//    System.out.println("Книга:" + bookF.title + " страниц:" + bookF.pages + '\n');
//    System.out.println("Книга:" + bookS.title + " страниц:" + bookS.pages + '\n');
//   //2)
//    Rectangle restangleF = new Rectangle(10.5, 2.4);
//    Rectangle restangleS = new Rectangle(5.2, 8.7);
//    System.out.println("Площадь:" + "restangleF:" + restangleF.getArea() + "restangleS" + restangleS.getArea());
//    System.out.println("Периметр:" + "restangleF:" + restangleF.getPerimeter() + "restangleS" + restangleS.getPerimeter());
//    if(restangleF.getArea() > restangleS.getArea())
//    {
//        System.out.println("У прямоугольника со сторонами:" + restangleF.width + " и " + restangleF.height + " площадь больше");
//    }
//    else if(restangleF.getArea() == restangleS.getArea())
//    {
//        System.out.println("У прямоугольникov площадь одинаковая");
//    }
//    else
//    {
//        System.out.println("У прямоугольника со сторонами:" + restangleS.width + " и " + restangleS.height + " площадь больше");
//    }
//   // 3)
//    BankAccount client = new BankAccount("Charli", 1500.5);
//    client.printInfo();
//
//    client.deposit(500);
//    client.printInfo();
//
//    client.withdraw(300);
//    client.printInfo();
//
//    client.withdraw(5000);
//    client.printInfo();

    //8.1
    Dog dog = new Dog("Fox");
    System.out.println("Имя: " + dog.getName());
    dog.makeSound();
    //8.2
    Car car = new Car();
    car.setBrand("Lamborghini");
    //car.speed(45);'speed' has private access in 'Vehicle'
    car.setSpeed(-145);
    System.out.println("Brand: " + car.getBrand());
    System.out.println("Speed: " + car.getSpeed());
    car.setSpeed(145);
    System.out.println("Speed: " + car.getSpeed());
    //8.4
//     Scanner scanner = new Scanner(System.in);
//    System.out.println("Введите количество фигур: ");
//    int n = scanner.nextInt();
//    Shape[] shapes = new Shape[n];
//    for(int i = 0; i < n; i++)
//    {
//        System.out.print("Введите тип фигуры ('C' — круг, 'R' — прямоугольник): ");
//        char type = scanner.next().charAt(0);
//        switch (type) {
//            case 'C':
//                System.out.println("Введите радиус круга:");
//                double radios = scanner.nextInt();
//                shapes[i] = new Circle(type, radios);
//                break;
//            case 'R':
//                System.out.println("Введите width прямоугольника:");
//                double width = scanner.nextInt();
//                System.out.println("Введите height прямоугольника:");
//                double height = scanner.nextInt();
//                shapes[i] = new Restengle(type, width, height);
//                break;
//            default:
//                System.out.println("ввод фигуры неверный!");
//                i--;  Ещё не готово


}
