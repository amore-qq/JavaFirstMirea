package ru.mirea.task6.task1;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.y += ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}

class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        this.center.moveUp();
    }

    @Override
    public void moveDown() {
        this.center.moveDown();
    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }

    @Override
    public void moveRight() {
        this.center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
 class Main {
     public static void main(String[] args) {
         MovableCircle movableCircle = new MovableCircle(5, 4, 1, 1, 7);
         System.out.println(movableCircle);
         movableCircle.moveDown();
         movableCircle.moveDown();
         movableCircle.moveUp();
         System.out.println(movableCircle);
         movableCircle.moveLeft();
         movableCircle.moveLeft();
         movableCircle.moveRight();
         System.out.println(movableCircle);
     }
 }