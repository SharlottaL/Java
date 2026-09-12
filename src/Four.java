import javax.swing.*;
import java.util.Scanner;
boolean ageIs(int age)
{
    if(age < 18)
    {
        return false;
    }
    else {
        return true;
    }
}
boolean primeNumberIs(int a)
{
    if(a <= 1) return false;

    for(int i = 2; i < a; i++)
    {
        if(a % i == 0) return false;
    }
    return true;
}
int countVowelLetter(String string) {
    int count = 0;
    for (int i = 0; i < string.length(); i++) {
        char simbol = string.charAt(i);
        if (simbol == 'А' || simbol == 'а' || simbol == 'Е' || simbol == 'е' || simbol == 'Ё' || simbol == 'ё' || simbol == 'И' ||
                simbol == 'и' || simbol == 'О' || simbol == 'о' || simbol == 'У' || simbol == 'у' || simbol == 'Ы' ||
                simbol == 'ы' || simbol == 'Э' || simbol == 'э' || simbol == 'Ю' || simbol == 'ю' || simbol == 'Я' || simbol == 'я') {
            count++;
        }
    }
    return count;
}

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите возраст: ");
    int age = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Подходит ли возраст: " + ageIs(age));

    System.out.println("Введите число: ");
    int a = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Простое ли число: " + primeNumberIs(a));

    System.out.println("Введите строку: ");
    String string = scanner.nextLine();
    System.out.println("Кол-во гласных букв в строке: " + countVowelLetter(string));

    int sum = 0;
    int count = 0;
    double result = 0;
    while(true)
    {
        System.out.print("Введите оценку (2-5) или 'стоп': ");
        String answer = scanner.nextLine();

        if(answer.equalsIgnoreCase("стоп"))
        {
            break;
        }
        int grade;
        try {
            grade = Integer.parseInt(answer);
        } catch (NumberFormatException e) {
            System.out.println("Ввод неверный");
            continue;
        }
       if (grade < 2 || grade > 5) {
            System.out.println("Оценка должна быть 2–5");
            continue;
        }
       sum += grade;
       count++;
    }
    result = (double)sum / count;
    String academicPerformance = "";
    if (result >= 4.75) {
        academicPerformance = "Отличник";
    } else if (result >= 3.65) {
        academicPerformance = "Хорошист";
    } else if (result >= 2.65) {
        academicPerformance = "Троечник";
    } else {
        academicPerformance = "Двоечник";
    }
    System.out.println(academicPerformance +" Средний бал:"+ result);
    scanner.close();
}