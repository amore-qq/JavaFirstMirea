package ru.mirea.task10.task10_from_doc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student() {
        this.name = null;
        this.age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void readStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя студента: ");
        this.name = sc.nextLine();
        System.out.println("Введите возраст студента: ");
        this.age = sc.nextInt();
    }

    public void printStudent() {
        System.out.println("Имя студента: " + this.name);
        System.out.println("Возраст студента: " + this.age);
    }
}

class StudentList {
    private List<Student> list;

    public StudentList() {
        this.list = new ArrayList<>();
    }

    public void addStudent(Student student) {
        list.add(student);
    }

    public void removeStudent(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        } else {
            System.out.println("Неверный индекс");
        }
    }

    public void printStudent(int index) {
        if (index >= 0 && index < list.size()) {
            list.get(index).printStudent();
        } else {
            System.out.println("Неверный индекс");
        }
    }

    public void clearList() {
        list.clear();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();
        boolean flag = true;

        while (flag) {
            System.out.println("Выберите одно из действий: ");
            System.out.println("1) Добавить студента");
            System.out.println("2) Удалить студента");
            System.out.println("3) Вывести информацию о студенте");
            System.out.println("4) Очистить картотеку");
            System.out.println("5) Проверить картотеку на пустоту");
            System.out.println("6) Выход из программы");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    Student student = new Student();
                    student.readStudent();
                    list.addStudent(student);
                    System.out.println("Студент был добавлен в картотеку\n");
                    break;
                case 2:
                    System.out.println("Введите индекс студента для удаления: ");
                    int indexRemove = sc.nextInt();
                    if (indexRemove >= 0 && indexRemove < list.size()) {
                        list.removeStudent(indexRemove);
                        System.out.printf("Студент №%d был удален\n", indexRemove);
                        break;
                    } else {
                        System.out.println("Введен неверный индекс");
                        break;
                    }
                case 3:
                    System.out.println("Введите индекс студента о котором хотите получить информацию: ");
                    int indexPrint = sc.nextInt();
                    if (indexPrint >= 0 && indexPrint < list.size()) {
                        list.printStudent(indexPrint);
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Введен неверный индекс");
                        break;
                    }
                case 4:
                    list.clearList();
                    System.out.println("Картотека очищена\n");
                    break;
                case 5:
                    if (list.isEmpty()) {
                        System.out.println("Картотека пуста\n");
                    } else {
                        System.out.println("Картотека не пуста\n");
                    }
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Введено недопустимое значение\n");
            }
        }
    }
}
