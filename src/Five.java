import java.util.Scanner;
public class Five {
    void main() {
        //1).
        Scanner console = new Scanner(System.in);
        System.out.println("Введите делимое:");
        int dividend = console.nextInt();
        System.out.println("Введите делитель:");
        int divisor = console.nextInt();
        try {
            int quotient = dividend / divisor;
            System.out.println("Частное:" + quotient);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } finally {
            console.close();
        }
       // 2).
        Scanner consoleP = new Scanner(System.in);
        boolean num = false;
        int number = 0;
        while (!num)
        {
            System.out.println("Введите строку для дальнейшего преобразования:");
            String string = consoleP.nextLine();
        try {
            number = Integer.parseInt(string);
            num = true;
        } catch (NumberFormatException e) {
            System.out.println("Введено не число");
        }
        }
        System.out.println("Строка из чисел преобразована успешно:" + number);
        consoleP.close();
       // 3)
        Scanner consoleAr = new Scanner(System.in);
        int[] array = {2,18,25,69,12};

        System.out.println("Введите индекс массива:");
        int index = consoleAr.nextInt();
        System.out.println("Введите делитель массива:");
        int divisorAr = consoleAr.nextInt();
        try {
        int dividendAr = array[index];
        double quotient = (double)dividendAr / divisorAr;
            System.out.println("Результат деления:"+quotient);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Введено значение выходящее за пределы массива");
        }
        catch (ArithmeticException e)
        {
            System.out.println("На ноль делить нельзя");
        }
        finally {
            System.out.println("Попытка обработки завершена");
            consoleAr.close();
        }
    }
}
