package ru.mirea.task2;

public class Point {
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
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
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
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}

class Tester {
    private Circle[] circles;
    private int amount;

    public Tester(int n) {
        circles = new Circle[n];
        amount = 0;
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

    public static void main(String[] args) {
        Tester tester = new Tester(3);

        Point center1 = new Point(5, 6);
        Point center2 = new Point(3, 9);
        Point center3 = new Point(8, 2);

        Circle circle1 = new Circle(center1, 2);
        Circle circle2 = new Circle(center2, 6);
        Circle circle3 = new Circle(center3, 3);

        tester.add(circle1);
        tester.add(circle2);
        tester.add(circle3);

        tester.print();

        System.out.println("Количество окружностей в массиве: " + tester.getAmount());
    }
}