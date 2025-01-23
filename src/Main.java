import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите задачу (1-20) или 0 для выхода:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Чтение остатка строки

            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    // Задача 1: Четное или нечетное число
                    System.out.println("Введите целое число:");
                    int num1 = scanner.nextInt();
                    System.out.println(num1 % 2 == 0 ? "Четное" : "Нечетное");
                    break;

                case 2:
                    // Задача 2: Минимальное из трех чисел
                    System.out.println("Введите три числа:");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();
                    int min = Math.min(a, Math.min(b, c));
                    System.out.println("Минимальное число: " + min);
                    break;

                case 3:
                    // Задача 3: Таблица умножения
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("5 * " + i + " = " + (5 * i));
                    }
                    break;

                case 4:
                    // Задача 4: Сумма чисел от 1 до N
                    System.out.println("Введите N:");
                    int n = scanner.nextInt();
                    int sum = (n * (n + 1)) / 2;
                    System.out.println("Сумма: " + sum);
                    break;

                case 5:
                    // Задача 5: Число Фибоначчи
                    System.out.println("Введите N:");
                    int fibN = scanner.nextInt();
                    int f1 = 0, f2 = 1;
                    System.out.print("Числа Фибоначчи: " + f1 + " " + f2 + " ");
                    for (int i = 2; i < fibN; i++) {
                        int fNext = f1 + f2;
                        System.out.print(fNext + " ");
                        f1 = f2;
                        f2 = fNext;
                    }
                    System.out.println();
                    break;

                case 6:
                    // Задача 6: Простое число
                    System.out.println("Введите число:");
                    int primeNum = scanner.nextInt();
                    boolean isPrime = true;
                    if (primeNum < 2) isPrime = false;
                    for (int i = 2; i <= Math.sqrt(primeNum); i++) {
                        if (primeNum % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    System.out.println(isPrime ? "Простое число" : "Не простое число");
                    break;

                case 7:
                    // Задача 7: Обратный порядок чисел
                    System.out.println("Введите N:");
                    int revN = scanner.nextInt();
                    for (int i = revN; i >= 1; i--) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 8:
                    // Задача 8: Сумма четных чисел
                    System.out.println("Введите два числа A и B:");
                    int A = scanner.nextInt();
                    int B = scanner.nextInt();
                    int evenSum = 0;
                    for (int i = Math.min(A, B); i <= Math.max(A, B); i++) {
                        if (i % 2 == 0) evenSum += i;
                    }
                    System.out.println("Сумма четных чисел: " + evenSum);
                    break;

                case 9:
                    // Задача 9: Реверс строки
                    System.out.println("Введите строку:");
                    String inputStr = scanner.nextLine();
                    System.out.println("Реверс строки: " + new StringBuilder(inputStr).reverse().toString());
                    break;

                case 10:
                    // Задача 10: Количество цифр в числе
                    System.out.println("Введите число:");
                    int digitNum = scanner.nextInt();
                    System.out.println("Количество цифр: " + String.valueOf(Math.abs(digitNum)).length());
                    break;

                case 11:
                    // Задача 11: Факториал числа
                    System.out.println("Введите N:");
                    int factN = scanner.nextInt();
                    long factorial = 1;
                    for (int i = 2; i <= factN; i++) {
                        factorial *= i;
                    }
                    System.out.println("Факториал: " + factorial);
                    break;

                case 12:
                    // Задача 12: Сумма цифр числа
                    System.out.println("Введите число:");
                    int sumNum = scanner.nextInt();
                    int digitSum = 0;
                    sumNum = Math.abs(sumNum); // Для отрицательных чисел
                    while (sumNum > 0) {
                        digitSum += sumNum % 10;
                        sumNum /= 10;
                    }
                    System.out.println("Сумма цифр: " + digitSum);
                    break;

                case 13:
                    // Задача 13: Палиндром
                    System.out.println("Введите строку:");
                    String palindromeStr = scanner.nextLine();
                    String reversedStr = new StringBuilder(palindromeStr).reverse().toString();
                    System.out.println(palindromeStr.equals(reversedStr) ? "Палиндром" : "Не палиндром");
                    break;

                case 14:
                    // Задача 14: Максимальное число в массиве
                    System.out.println("Введите размер массива:");
                    int arrSize = scanner.nextInt();
                    int[] arr = new int[arrSize];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < arrSize; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    int maxNum = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
                    System.out.println("Максимальное число: " + maxNum);
                    break;

                case 15:
                    // Задача 15: Сумма всех элементов массива
                    System.out.println("Введите размер массива:");
                    int arrSize2 = scanner.nextInt();
                    int[] arr2 = new int[arrSize2];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < arrSize2; i++) {
                        arr2[i] = scanner.nextInt();
                    }
                    int arraySum = Arrays.stream(arr2).sum();
                    System.out.println("Сумма элементов: " + arraySum);
                    break;

                case 16:
                    // Задача 16: Количество положительных и отрицательных чисел
                    System.out.println("Введите размер массива:");
                    int arrSize3 = scanner.nextInt();
                    int[] arr3 = new int[arrSize3];
                    System.out.println("Введите элементы массива:");
                    int posCount = 0, negCount = 0;
                    for (int i = 0; i < arrSize3; i++) {
                        arr3[i] = scanner.nextInt();
                        if (arr3[i] > 0) posCount++;
                        if (arr3[i] < 0) negCount++;
                    }
                    System.out.println("Положительных: " + posCount + ", Отрицательных: " + negCount);
                    break;

                case 17:
                    // Задача 17: Простые числа в диапазоне
                    System.out.println("Введите A и B:");
                    int primeA = scanner.nextInt();
                    int primeB = scanner.nextInt();
                    for (int i = Math.min(primeA, primeB); i <= Math.max(primeA, primeB); i++) {
                        if (isPrime(i)) System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 18:
                    // Задача 18: Подсчет гласных и согласных
                    System.out.println("Введите строку:");
                    String vowelsStr = scanner.nextLine().toLowerCase();
                    int vowels = 0, consonants = 0;
                    for (char ch : vowelsStr.toCharArray()) {
                        if (ch >= 'a' && ch <= 'z') {
                            if ("aeiou".indexOf(ch) != -1) vowels++;
                            else consonants++;
                        }
                    }
                    System.out.println("Гласные: " + vowels + ", Согласные: " + consonants);
                    break;

                case 19:
                    // Задача 19: Перестановка слов
                    System.out.println("Введите строку:");
                    String wordsStr = scanner.nextLine();
                    String[] words = wordsStr.split(" ");
                    Collections.reverse(Arrays.asList(words));
                    System.out.println(String.join(" ", words));
                    break;

                case 20:
                    // Задача 20: Число Армстронга
                    System.out.println("Введите число:");
                    int armstrongNum = scanner.nextInt();
                    int originalNum = armstrongNum, armSum = 0, numDigits = String.valueOf(armstrongNum).length();
                    while (armstrongNum > 0) {
                        int digit = armstrongNum % 10;
                        armSum += Math.pow(digit, numDigits);
                        armstrongNum /= 10;
                    }
                    System.out.println(armSum == originalNum ? "Число Армстронга" : "Не число Армстронга");
                    break;

                default:
                    System.out.println("Неверный выбор! Попробуйте еще раз.");
            }
        }
    }

    // Функция проверки простого числа
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}