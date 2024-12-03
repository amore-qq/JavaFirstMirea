package ru.mirea.task2;

public class ReverseArray {
    public static void main(String[] args) {
        String[] array = {"dog", "cat", "frog", "elephant", "shark"};
        System.out.println("Исходный массив: ");
        print(array);
        System.out.println("Перевернутый массив: ");
        reverse(array);
        print(array);
    }

    public static void print(String[] array) {
        for (String el : array) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void reverse(String[] array) {
        int len = array.length;
        for (int i = 0; i < len / 2; i++) {
            String temp = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = temp;
        }
    }
}
