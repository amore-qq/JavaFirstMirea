package ru.mirea.lab2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball.toString());
        ball.setXY(3.0, 5.6);
        System.out.println(ball.toString());
        ball.move(4.5, -3.8);
        System.out.println(ball.toString());
    }
}
