package ru.mirea.uibo02.trukhachev;

import java.util.Arrays;

class MovablePoint implements Movable
{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public void moveUp()
    {
        this.y += ySpeed;
    }
    public void moveDown()
    {
        this.y -= ySpeed;
    }
    public void moveLeft()
    {
        this.x -= xSpeed;
    }
    public void moveRight()
    {
        this.x += xSpeed;
    }
}
class MovableCircle implements Movable
{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public final void moveUp()
    {
        this.center.x +=4;
        this.center.y +=7;
    }
    public final void moveDown()
    {
        this.center.x -=6;
        this.center.y -=2;
    }
    public final void moveLeft()
    {
        this.center.x -=2;
        this.center.y -=9;
    }
    public final void moveRight()
    {
        this.center.x +=4;
        this.center.y +=7;
    }
}

interface Movable
{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();

}

public class Main
{
    public static void main(String[] args)
    {
        MovablePoint point = new MovablePoint(1, 1, 2, 2);
        System.out.println("Point:");
        System.out.println(point);
        point.moveUp();
        point.moveRight();
        System.out.println("Up+Right ->" + point);
        MovableCircle circle = new MovableCircle(1, 1, 2, 2, 2);
        System.out.println("circle:");
        System.out.println(circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("Down+Left ->" + circle);
    }
}