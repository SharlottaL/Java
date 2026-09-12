import java.util.Scanner;
void main() {
    //2.1
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите a: ");
    int a = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Введите b: ");
    int b = scanner.nextInt();

    for(int i = a; i <= b; i++)
    {
        if(i % 2 == 0) {
            System.out.print(i + " ");
        }
    }

//    //2.2
    System.out.println("Введите n: ");
    int nF = scanner.nextInt();

    int[] fibonachiNumbers = new int[nF];
    int aF = 0;
    int bF = 1;
   for(int i = 0; i < nF; i++ )
   {
   fibonachiNumbers[i] = aF;
       int next = aF + bF;
       aF = bF;
       bF = next;
   }
    System.out.println("Первые " + nF + " чисел Фибоначчи: ");
    for (int i = 0; i < nF; i++) {
        if(fibonachiNumbers[i] % 3 == 0)
        {
            System.out.print(" Fizz ");
        }
        else {
            System.out.print(fibonachiNumbers[i] + " ");
        }
    }
    //2.3
    System.out.println("Введите n: ");
    int n = scanner.nextInt();
    int count = 0;
    int sum = 0;
    for(int i = 2; i < n; i++)
    {
        boolean isPrime = true;
        for (int j = 2; j < i; j++)
        {
            if (i % j == 0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            count++;

            int temp = i;
            int digitSum = 0;
            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }

            sum += digitSum;
        }
    }
    System.out.print("Kоличество простых чисел: " + count + " суммa их цифр:" + sum);
    scanner.close();
}