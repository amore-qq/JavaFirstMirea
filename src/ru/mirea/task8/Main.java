package ru.mirea.task8;

import java.util.Scanner;

public class Main {
    // task 14
    public static void recursion(int n) {
        if (n == 0) {
            return;
        }
        recursion(n / 10);
        System.out.print(n % 10  + " | ");
    }

    // task 15
    public static void recursion1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n % 10 + " | ");
        recursion1(n / 10);
    }

    // task 16
    public static void recursion2(int maxi, int c) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            if (n > maxi) {
                recursion2(n, 1);
            } else if (n == maxi) {
                c++;
                recursion2(n, c);
            } else {
                recursion2(maxi, c);
            }
        } else {
            System.out.println("Количество элементов равное максимуму последовательности: " + c
                    + "\nМаксимальный элемент: " + maxi);
        }
    }

    // task 17
    public static int recursion3() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            return 0;
        } else {
            return Math.max(n, recursion3());
        }
    }

    // task 1
    public static String recursion4(int n) {
        int sum = 0;
        int j = 0;
        // Базовый случай
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            // Шаг рекурсии / рекурсивное условие
            System.out.print(recursion4(--n) + " " + j);
        }
        return "";
    }

    public static void main(String[] args) {
        recursion(123);
        System.out.println();
        recursion1(123);
        System.out.println();
        recursion2(0, 0);
        System.out.println("\nМаксимальное число последовательности: " + recursion3() + "\n");
        recursion4(8);
    }
}
