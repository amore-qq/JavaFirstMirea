/*
Задания на практическую работу № 1
1. Создать проект в IntelliJ IDEA
2. Создать свой собственный Git репозитарий
3. Написать программу, в результате которой массив чисел создается с
помощью инициализации (как в Си) вводится и считается в цикле сумма
элементов целочисленного массива, а также среднее арифметическое его
элементов результат выводится на экран. Использовать цикл for.
4. Написать программу, в результате которой массив чисел вводится
пользователем с клавиатуры считается сумма элементов целочисленного
массива с помощью циклов do while, while, также необходимо найти
максимальный и минимальный элемент в массиве, результат выводится на экран.
5. Написать программу, в результате которой выводятся на экран
аргументы командной строки в цикле for.
6. Написать программу, в результате работы которой выводятся на экран
первые 10 чисел гармонического ряда (форматировать вывод).
7. Написать программу, которая с помощью метода класса, вычисляет
факториал числа (использовать управляющую конструкцию цикла), проверить
работу метода.
8. Результаты выполнения практической работы залить через IDE в свой
репозитарий и продемонстрировать преподавателю.
*/

package ru.mirea.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        int sum = 0;
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.print("1. Сумма чисел в массиве: " + sum + " ");
        System.out.println("Среднее арифмитическое массива: " + (double) sum / n);
        int min = array[0];
        int max = array[0];
        int j = 1;
        while (j < array.length) {
            if (min > array[j]) {
                min = array[j];
            }
            if (max < array[j]) {
                max = array[j];
            }
            j++;
        }
        System.out.println("2. Min: " + min + " " + "Max: " + max);
        System.out.print("3. ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.print("\n4. ");
        for (int i = 1; i <= 10; i++) {
            System.out.print((double) 1 / i + " ");
        }
        System.out.println("\nВведите значение, для которого нужно вычислить факториал: ");
        System.out.println("5. Факториал равен: " + factorial(sc.nextInt()));
    }
    public static int factorial(int num) {
        int res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }
}



