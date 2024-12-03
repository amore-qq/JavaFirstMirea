package ru.mirea.task2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку текста, слова разделяйте пробелом: ");

        String[] array = sc.nextLine().split(" ");
        System.out.println("Введено слов: " + array.length);
    }
}