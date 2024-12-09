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

    // task 18
    public static int recursion4() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            return 0;
        } else {
            return Math.max(n, recursion4());
        }
    }
    public static void main(String[] args) {
        recursion(123);
        System.out.println();
        recursion1(123);
        System.out.println();
        recursion2(0, 0);
        System.out.println();
        System.out.println(recursion4());
    }
}
