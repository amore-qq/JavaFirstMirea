package ru.mirea.task9;

import java.util.Random;

class Student {
    private String name;
    private int id;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class Test {
    public static void sort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student curr = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getId() > curr.getId()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[20];
        Random random = new Random();

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(random.nextInt(500), String.format("Student №%d", i + 1));
        }
        System.out.println("Изначальный массив: \n");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
        sort(students);
        System.out.println("Отсортированный массив: \n)");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
