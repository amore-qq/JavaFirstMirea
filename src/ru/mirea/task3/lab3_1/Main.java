package ru.mirea.task3.lab3_1;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[4];
        Random rndm = new Random();
        //1
        System.out.print("1. Введите количество элементов массива: \n");
        int amount = sc.nextInt();
        double[] randomArray1 = new double[amount];
        double[] randomArray2 = new double[amount];
        for (int i = 0; i < amount; i++) {
            randomArray1[i] = Math.random() * 100;
            randomArray2[i] = rndm.nextDouble() * 100;
        }
        System.out.println("Неотсортированный 1 массив: ");
        for (double d : randomArray1) {
            System.out.println(d);
        }
        System.out.println("\nОтсортированный 1 массив: ");
        Arrays.sort(randomArray1);
        for (double d : randomArray1) {
            System.out.println(d);
        }
        System.out.println("\nНеотсортированный 2 массив: ");
        for (double d : randomArray2) {
            System.out.println(d);
        }
        System.out.println("\nОтсортированный 2 массив: ");
        Arrays.sort(randomArray2);
        for (double d : randomArray2) {
            System.out.println(d);
        }
        // 3
        boolean flag = true;
        int temp;
        for (int i = 0; i < array.length; i++) {
            array[i] = rndm.nextInt(10, 100);
        }
        temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (temp < array[i]) {
                temp = array[i];
            }
            if (temp > array[i]) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("\n3. Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("\n3. Массив не является строго возрастающей последовательностью");
        }
        System.out.println(Arrays.toString(array));
        System.out.println("4. Введите размер массива больше 0: ");
        int n = sc.nextInt();
        while (n < 1) {
            System.out.println("Пожалуйста, введите размер массива больше 0");
            n = sc.nextInt();
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rndm.nextInt(n + 1);
        }
        System.out.println(Arrays.toString(a));
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                b.add(a[i]);
            }
        }
        System.out.println(b);
    }
}
