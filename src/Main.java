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
//    Dog dog = new Dog("Fox");
//    System.out.println("Имя: " + dog.getName());
//    dog.makeSound();
//    //8.2
//    Car car = new Car();
//    car.setBrand("Lamborghini");
//    //car.speed(45);'speed' has private access in 'Vehicle'
//    car.setSpeed(-145);
//    System.out.println("Brand: " + car.getBrand());
//    System.out.println("Speed: " + car.getSpeed());
//    car.setSpeed(145);
//    System.out.println("Speed: " + car.getSpeed());
//
//    //8.3
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Введите количество сотрудников: ");
//    int n = scanner.nextInt();
//    scanner.nextLine();
//    Employee[] employee = new Employee[n];
//    double sum = 0;
//    for(int i = 0; i < n; i++) {
//        System.out.println("Введите имя:");
//        String name = scanner.nextLine();
//        System.out.println("Введите базовую зарплату:");
//        double baseSalary = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.print("Введите 'M' или 'D': ");
//        char type = scanner.next().charAt(0);
//        scanner.nextLine();
//        switch (type) {
//            case 'M':
//                employee[i] = new Manager(name, baseSalary);
//                break;
//            case 'D':
//                employee[i] = new Developer(name, baseSalary);
//                break;
//            default:
//                System.out.println("ввод должности неверный!");
//                i--;
//        }
//    }
//    for(int i = 0; i < employee.length; i++) {
//        System.out.println(employee[i].getName() +" : " + employee[i].calculatePay());
//        sum += employee[i].calculatePay();
//    }
//    System.out.println("Общая сумма выплат: " + sum);
//    scanner.close();
//}

//    //8.4
//     Scanner scanner = new Scanner(System.in);
//    System.out.println("Введите количество фигур: ");
//    int n = scanner.nextInt();
//    Shape[] shapes = new Shape[n];
//    for(int i = 0; i < n; i++) {
//        System.out.print("Введите тип фигуры ('C' — круг, 'R' — прямоугольник): ");
//        char type = scanner.next().charAt(0);
//        switch (type) {
//            case 'C':
//                System.out.println("Введите радиус круга:");
//                double radius = scanner.nextDouble();
//                shapes[i] = new Circle(type, radius);
//                break;
//            case 'R':
//                System.out.println("Введите width прямоугольника:");
//                double width = scanner.nextDouble();
//                System.out.println("Введите height прямоугольника:");
//                double height = scanner.nextDouble();
//                shapes[i] = new Restengle(type, width, height);
//                break;
//            default:
//                System.out.println("ввод фигуры неверный!");
//                i--;
//        }
//    }
//    for(int i = 0; i < shapes.length; i++)
//    {
//        System.out.println("Площадь фигуры:"+ shapes[i].area() +" тип фигуры: "+shapes[i].getType());
//    }
//    double areaM = shapes[0].area();
//    char areaI = shapes[0].getType();
//    for(int i = 1; i < shapes.length; i++) {
//       if(shapes[i].area() > areaM)
//       {
//           areaM = shapes[i].area();
//           areaI = shapes[i].getType();
//       }
//    }
//    System.out.println("Площадь фигуры с максимальной площадью:" + areaM + " тип фигуры: " + areaI);
//    scanner.close();
    //9.1
    Scanner scanner = new Scanner(System.in);
//    Person[] persons = new Person[4];
//    for (int i = 0; i < persons.length; i++) {
//        System.out.println("Введите Name:");
//        String name = scanner.nextLine();
//        System.out.println("Введите Age:");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Введите 'P' || 'S': ");
//        char type = scanner.next().charAt(0);
//        scanner.nextLine();
//        switch (type) {
//            case 'P':
//                persons[i] =new Person(name, age);
//                break;
//            case 'S':
//                System.out.println("Введите Grade:");
//                double grade = scanner.nextDouble();
//                persons[i] =new Student(name, age, grade);
//                break;
//            default:
//                System.out.println("ввод неверный!");
//                persons[i] =new Person(name, age);
//        }
//    }
//    for(Person person: persons)
//    {
//        person.displayInfo();
//    }
//
//    //9.2
//    BankAccount[] accounts = {new BankAccount("Owner1", 100.50), new CheckingAccount("Owner2",5000, 500), new SavingsAccount("Owner3", 600, 1.2)};
//    for(BankAccount account: accounts)
//    {
//        account.calculateYearlyReport();
//    }
    //10.1
//    Animal[] animals = {new Dog("Fox"), new Cat("Kiti"), new Dog("Tosha"), new Cat("Tina")};
//    for(Animal animal: animals)
//    {
//        animal.makeSound();
//        animal.sleep();
//    }
//    //10.2
//    Drawable[] drawables = {new Circle(9.3), new TextLabel("Kiti"), new Circle(2.3), new TextLabel("Этот текст")};
//    for(Drawable drawable: drawables)
//    {
//        drawable.draw();
//    }
//    //10.3
////    System.out.println("Введите количество сотрудников: ");
////    int n = scanner.nextInt();
////    scanner.nextLine();
////    Payable[] employee = new Payable[n];
////    double sum = 0;
////    for(int i = 0; i < n; i++) {
////        System.out.println("Введите имя:");
////        String name = scanner.nextLine();
////        System.out.println("Введите базовую зарплату:");
////        double baseSalary = scanner.nextDouble();
////        scanner.nextLine();
////        System.out.print("Введите 'M' или 'D': ");
////        char type = scanner.next().charAt(0);
////        scanner.nextLine();
////        switch (type) {
////            case 'M':
////                employee[i] = new Manager(name, baseSalary);
////                break;
////            case 'D':
////                employee[i] = new Developer(name, baseSalary);
////                break;
////            default:
////                System.out.println("ввод должности неверный!");
////                i--;
////        }
////    }
////    for(int i = 0; i < employee.length; i++) {
////        System.out.println(employee[i].getName() +" : " + employee[i].calculatePay());
////        sum += employee[i].calculatePay();
////    }
////
////    System.out.println("Общая сумма выплат: " + sum);
//    scanner.close();

    //11.1

    Temperature temperature = new Temperature(-300);
    System.out.println(temperature);
    Temperature temperature1 = new Temperature(25);
    System.out.println(temperature1.toFahrenheit());

    //11.2
    Shape s = new Rectangle(3,4);
    System.out.println(s.area());

}



