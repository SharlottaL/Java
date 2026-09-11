//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //1)
 Book bookF = new Book("Martin Eden", 448);
 Book bookS = new Book("Towards Zero", 242);
    System.out.println("Книга:" + bookF.title + " страниц:" + bookF.pages + '\n');
    System.out.println("Книга:" + bookS.title + " страниц:" + bookS.pages + '\n');
   //2)
    Rectangle restangleF = new Rectangle(10.5, 2.4);
    Rectangle restangleS = new Rectangle(5.2, 8.7);
    System.out.println("Площадь:" + "restangleF:" + restangleF.getArea() + "restangleS" + restangleS.getArea());
    System.out.println("Периметр:" + "restangleF:" + restangleF.getPerimeter() + "restangleS" + restangleS.getPerimeter());
    if(restangleF.getArea() > restangleS.getArea())
    {
        System.out.println("У прямоугольника со сторонами:" + restangleF.width + " и " + restangleF.height + " площадь больше");
    }
    else if(restangleF.getArea() == restangleS.getArea())
    {
        System.out.println("У прямоугольникov площадь одинаковая");
    }
    else
    {
        System.out.println("У прямоугольника со сторонами:" + restangleS.width + " и " + restangleS.height + " площадь больше");
    }
   // 3)
    BankAccount client = new BankAccount("Charli", 1500.5);
    client.printInfo();

    client.deposit(500);
    client.printInfo();

    client.withdraw(300);
    client.printInfo();

    client.withdraw(5000);
    client.printInfo();
}
