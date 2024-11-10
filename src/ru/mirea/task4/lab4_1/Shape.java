package ru.mirea.task4.lab4_1;

public class Shape {
    public String getType() {
        return "";
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{Type = " + getType() + ", Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius + "}";
    }
}

class Rectangle extends Shape {
    private final double a;
    private final double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return super.toString() + ", Side A: " + a + ", Side B: " + b + "}";
    }
}


class Square extends Shape {
    private final double a;

    Square(double a) {
        this.a = a;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public double getArea() {
        return Math.pow(a, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return super.toString() + ", Side: " + a + "}";
    }
}

class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(4, 5);
        Square square = new Square(4);
        System.out.println(circle.toString() + "\n" + rectangle.toString() + "\n" + square.toString());
        Shape[] shapes = {circle, rectangle, square};
        System.out.println();
        System.out.println("Вызов методов, используя родительскую ссылку(полиморфизм):");
        System.out.println();
        for (Shape shape: shapes) {
            System.out.println("Type: " + shape.getType());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println();
        }
    }
}
