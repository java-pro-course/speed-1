package com.company;

import java.util.Scanner;

class Triangle{
    private Point A;
    private Point B;
    private Point C;

    public Triangle(Point p1, Point p2, Point p3) {
        this.A = p1;
        this.B = p2;
        this.C = p3;
    }

    public int P(Point AB, Point BC, Point CA){
        return Point.findDistance(AB, BC) + Point.findDistance(CA, AB) + Point.findDistance(BC, CA);
    }
}

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
        System.out.println("Введите координаты второй точки");
        Point p3 = new Point(in.nextInt(), in.nextInt());
        System.out.println("Вот периметр треугольника: ");
        Triangle triangle = new Triangle(p1, p2, p3);
        System.out.println(triangle.P(p1, p2, p3));
    }
}
