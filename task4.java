

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
class Point{
    private int x;
    private int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Point p1 = new Point(in.nextInt(), in.nextInt());
        Point p2 = new Point(in.nextInt(), in.nextInt());
        System.out.println(findDistance(p1, p2));
    }
    public static double findDistance(Point p1, Point p2){
        return Math.sqrt((p2.getX() - p1.getX()) + (p2.getY()- p1.getY()));
    }
}
