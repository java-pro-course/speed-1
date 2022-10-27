import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public static double distance(Point a, Point b)
    {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

class Triangle{
    private Point A;
    private Point B;
    private Point C;

    public Triangle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
    }

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public Point getC() {
        return C;
    }

    public void setA(Point a) {
        A = a;
    }

    public void setB(Point b) {
        B = b;
    }

    public void setC(Point c) {
        C = c;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point A = new Point(scanner.nextInt(),scanner.nextInt());
        Point B = new Point(scanner.nextInt(),scanner.nextInt());
        Point C = new Point(scanner.nextInt(),scanner.nextInt());
        double AB =  Point.distance(A, B);
        double BC =  Point.distance(B, C);
        double AC =  Point.distance(A, C);
        System.out.println("Периметр: " + (AC+AB+BC));

    }
}
