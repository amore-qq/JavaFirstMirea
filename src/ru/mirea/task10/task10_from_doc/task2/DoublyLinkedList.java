package ru.mirea.task10.task10_from_doc.task2;

import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private Student prev;
    private Student next;

    public Student() {
        this.name = null;
        this.age = 0;
        this.next = null;
        this.prev = null;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.next = null;
        this.prev = null;
    }

    public void readStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя студента: ");
        this.name = sc.nextLine();
        System.out.println("Введите возраст студента: ");
        this.age = sc.nextInt();
    }

    public void printStudent() {
        System.out.println("Имя студента: " + name);
        System.out.println("Возраст студента: " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getPrev() {
        return prev;
    }

    public void setPrev(Student prev) {
        this.prev = prev;
    }

    public Student getNext() {
        return next;
    }

    public void setNext(Student next) {
        this.next = next;
    }
}

class StudentList {
    private Student head;
    private Student tail;

    public StudentList() {
        this.head = null;
        this.tail = null;
    }

    public void addStudent(Student student) {
        if (head == null) {
            head = student;
            tail = student;
        } else {
            tail.setNext(student);
            student.setPrev(tail);
            tail = student;
        }
    }

    public void removeStudent(int index) {
        Student curr = head;
        int currInd = 0;

        while (curr != null && currInd < index) {
            curr = curr.getNext();
            currInd++;
        }

        if (curr == null) {
            System.out.println("Неверный индекс");
            return;
        }

        if (curr.getPrev() != null) {
            curr.getPrev().setNext(curr.getNext());
        } else {
            head = curr.getNext();
        }

        if (curr.getNext() != null) {
            curr.getNext().setPrev(curr.getPrev());
        } else {
            tail = curr.getPrev();
        }
    }

    public void printStudent(int index) {
        Student curr = head;
        int currInd = 0;
        while (curr != null && currInd < index) {
            curr = curr.getNext();
            currInd++;
        }

        if (curr == null) {
            System.out.println("Неверный индекс");
        } else {
            curr.printStudent();
        }
    }

    public void clearList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();
        boolean flag = true;

        while (flag) {
            System.out.println("1) Добавить студента");
            System.out.println("2) Удалить студента");
            System.out.println("3) Вывести информацию о студенте");
            System.out.println("4) Очистить картотеку");
            System.out.println("5) Проверить картотеку на пустоту");
            System.out.println("0) Выход из программы");
            System.out.print("Выберите одно из действий: ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    Student student = new Student();
                    student.readStudent();
                    list.addStudent(student);
                    System.out.println("Студент был добавлен в картотеку\n");
                    break;
                case 2:
                    System.out.print("Введите индекс студента для удаления: ");
                    int indexRemove = sc.nextInt();
                    list.removeStudent(indexRemove);
                    System.out.printf("Студент №%d был удален из картотеки\n", indexRemove);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Введите индекс студента о котором хотите получить информацию: ");
                    int indexPrint = sc.nextInt();
                    list.printStudent(indexPrint);
                    System.out.println();
                    break;
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
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Введено недопустимое значение\n");
            }
        }
    }
}
