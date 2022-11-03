package com.company;

import java.util.Scanner;

class Point{
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static int findDistance(Point point1, Point point2){
        return (int) (Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2)));
    }
}

public class Main {

    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Введите координаты первой точки");
        Point p1 = new Point(in.nextInt(), in.nextInt());
        System.out.println("Введите координаты второй точки");
        Point p2 = new Point(in.nextInt(), in.nextInt());
        System.out.println("Вот растояние между ними");
        System.out.println(Point.findDistance(p1, p2));
    }
}
