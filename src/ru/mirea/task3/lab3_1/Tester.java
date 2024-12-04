package ru.mirea.task3.lab3_1;

import ru.mirea.task9.Test;

import java.util.Random;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Point{" +
                "x=" + "%.2f" +
                ", y=" + "%.2f" +
                '}', x, y);
    }
}

class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle{" +
                "center=" + center +
                ", radius=%.2f" +
                '}', radius);
    }
}

public class Tester {
    private Circle[] circles;
    private int amount;

    public Tester(int n) {
        circles = new Circle[n];
        amount = 0;
        randomCircles();
    }

    private void randomCircles() {
        for (int i = 0; i < circles.length; i++) {
            double a = Math.random() * 100;
            double b = Math.random() * 100;
            double r = Math.random() * 100;
            circles[i] = new Circle(new Point(a, b), r);
            amount++;
        }
    }

    public void add(Circle circle) {
        if (amount < circles.length) {
            circles[amount] = circle;
            amount++;
        } else {
            System.out.println("Массив полон");
        }
    }

    public void print() {
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }

    public int getAmount() {
        return this.amount;
    }

    public Circle min() {
        Circle min = circles[0];
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].getRadius() < min.getRadius()) {
                min = circles[i];
            }
        }
        return min;
    }

    public Circle max() {
        Circle max = circles[0];
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].getRadius() > max.getRadius()) {
                max = circles[i];
            }
        }
        return max;
    }

    public void sort() {
        for (int i = 0; i < amount - 1; i++) {
            for (int j = 0 ; j < amount - i - 1; j++) {
                if (circles[j].getRadius() > circles[j + 1].getRadius()) {
                    Circle temp = circles[j];
                    circles[j] = circles[j + 1];
                    circles[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Tester tester = new Tester(10);
        System.out.println("Неотсортированный массив: ");
        tester.print();
        System.out.println();
        tester.sort();
        System.out.println("Отсортированный массив: ");
        tester.print();
        System.out.println("\nНаименьшая окружность: \n" + tester.min());
        System.out.println("\nНаибольшая окружность: \n" + tester.max());
    }
}
