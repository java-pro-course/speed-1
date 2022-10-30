
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





public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2,2);
        Point p2 = new Point(4,4);
        System.out.println("Distance between them is " + Point.distance(p1, p2));

    }


}

