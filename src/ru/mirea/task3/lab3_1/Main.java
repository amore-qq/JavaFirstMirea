package ru.mirea.task3.lab3_1;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random rndm = new Random();
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
            System.out.println("3. Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("3. Массив не является строго возрастающей последовательностью");
        }
        System.out.println(Arrays.toString(array));
        System.out.println("4. Введите размер массива больше 0: ");
        Scanner sc = new Scanner(System.in);
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
        System.out.println(b.toString());
    }
}
