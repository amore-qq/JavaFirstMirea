package ru.mirea.task2;

import java.util.Scanner;

class HowMany2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Вводите по одному слову");
        boolean flag = true;
        while (flag) {
            String temp = sc.nextLine();
            if (temp.equals("q")) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
