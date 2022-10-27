package com.company;

import java.util.Scanner;

class Point{
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public int findDistance(Point point1, Point point2){
        int distanceX = point1.x - point2.x;
        int distanceY = point1.y - point2.y;
        int distance = (int)Math.sqrt(distanceX*distanceX+distanceY*distanceY);
        return distance;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int y1 = in.nextInt();
        int y2 = in.nextInt();
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        System.out.println(point1.findDistance(point1, point2));
    }
}
