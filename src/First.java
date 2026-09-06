import java.util.Scanner;

public class First {
    void main()
    {
        //1).
        Scanner console = new Scanner(System.in);
        System.out.println("Введите своё имя:");
        String firstName = console.nextLine();
        System.out.println("Введите свой возраст:");
        int age = console.nextInt();
        System.out.println("Приветствую пользователя " + firstName + ", возраст которого " + age);

        //2);
        console = new Scanner(System.in);
        System.out.println("Введите название товара:");
        String title = console.nextLine();
        System.out.println("Введите цену за одну штуку:");
        int price = console.nextInt();
        System.out.println("Введите количество товара:");
        int colvo = console.nextInt();
        int sum = price * colvo;
        System.out.println("Красивый Чек\n" + title + "\tКол-во " + colvo + "\tИтого:" + sum);

        //3);
        console = new Scanner(System.in);
        System.out.println("Введите уровень персонажа:");
        int level = console.nextInt();
        console.nextLine();
        System.out.println("Введите имя персонажа:");
        String name = console.nextLine();
        System.out.println("Введите базовое здоровье:");
        int health = console.nextInt();
        console.nextLine();
        System.out.println("Введите класс персонажа:");
        String category = console.nextLine();
        System.out.println("Yровень персонажа:\t" + level + "\nИмя персонажа:\t" + name + "\nБазовое здоровье:\t" + health + "\nKласс персонажа:\t" + category);
    }
}
