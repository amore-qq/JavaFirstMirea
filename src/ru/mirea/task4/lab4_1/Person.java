package ru.mirea.task4.lab4_1;

public class Person {
    private final String fullName;
    private final int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        this.fullName = "Неизвестный";
        this.age = 0;
    }

    public void talk() {
        System.out.println(String.format("%s говорит.", fullName));
    }

    public void move() {
        System.out.println(String.format("%s идёт.", fullName));
    }
}

class Main {
    public static void main(String[] args) {
        Person unknown = new Person();
        Person man = new Person("Кирилл Мишкин", 25);
        Person[] persons = {unknown, man};
        for (Person person : persons) {
            person.talk();
            person.move();
            System.out.println();
        }
    }
}
