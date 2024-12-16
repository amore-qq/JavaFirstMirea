package ru.mirea.task10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Student {
    private String name;
    private String surname;
    private String specialization;
    private int course;
    private String group;
    private double GPA;

    public Student(String name, String surname, String specialization, int course, String group, double GPA) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                ", Фамилия: " + surname +
                ", Специализация: " + specialization +
                ", Курс: " + course +
                ", Группа: " + group;
    }
}

class ComparatorByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getGPA(), o1.getGPA());
    }
}

class ComparatorByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class Main {
    ArrayList<Student> iDNumber = new ArrayList<>();

    void setArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество студентов: ");
        int size = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size; i++) {
            System.out.println("Введите данные о студенте:");
            System.out.println("Имя студента: ");
            String name = sc.nextLine();
            System.out.println("Фамилия студента: ");
            String surname = sc.nextLine();
            System.out.println("Специальность студента: ");
            String specialization = sc.nextLine();
            System.out.println("Курс студента: ");
            int course = Integer.parseInt(sc.nextLine());
            System.out.println("Группа студента: ");
            String group = sc.nextLine();
            System.out.println("Средний балл студента: ");
            double gpa = Double.parseDouble(sc.nextLine());
            iDNumber.add(new Student(name, surname, specialization, course, group, gpa));
        }
    }

    void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    void quickSort(Comparator<Student> comparator) {
        iDNumber.sort(comparator);
    }

    void merge(ArrayList<Student> list, int left, int mid, int right, Comparator<Student> comparator) {
        ArrayList<Student> leftArr = new ArrayList<>(list.subList(left, mid + 1));
        ArrayList<Student> rightArr = new ArrayList<>(list.subList(mid + 1, right + 1));
        int i = 0, j = 0, k = left;
        while (i < leftArr.size() && j < rightArr.size()) {
            if (comparator.compare(leftArr.get(i), rightArr.get(j)) <= 0) {
                list.set(k++, leftArr.get(i++));
            } else {
                list.set(k++, rightArr.get(j++));
            }
        }

        while (i < leftArr.size()) {
            list.set(k++, leftArr.get(i++));
        }

        while (j < rightArr.size()) {
            list.set(k++, rightArr.get(j++));
        }
    }

    void mergeSort(ArrayList<Student> list, int left, int right, Comparator<Student> comparator) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(list, left, mid, comparator);
            mergeSort(list, mid + 1, right, comparator);
            merge(list, left, mid, right, comparator);
        }
    }

    public void mergeSort(Comparator<Student> comparator) {
        mergeSort(iDNumber, 0, iDNumber.size() - 1, comparator);
    }

    public static void main(String[] args) {
        Main array = new Main();
        Main array1 = new Main();
        System.out.println("Изначальный массив: ");
        array.setArray();
        array.outArray();
        System.out.println("\nОтсортированный массив по среднему баллу(быстрая сортировка): ");
        array.quickSort(new ComparatorByGPA());
        array.outArray();
        System.out.println("\nОтсортированный массив по среднему баллу(сортировка вставками): ");
        array.mergeSort(new ComparatorByGPA());
        array.outArray();
        System.out.println("\nОтсортированный массив по именам: ");
        array.quickSort(new ComparatorByName());
        array.outArray();
    }
}