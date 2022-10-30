import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(in.nextInt(), in.nextInt());
        Point point2 = new Point(in.nextInt(), in.nextInt());
        System.out.println(point1.findDistance(point1, point2));
    }
    public static Scanner in = new Scanner(System.in);

}

class Point {
    private int x;
    private int y;
    Point (int x, int y){
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

    public int findDistance(Point point1, Point point2){
        int distance = 0;
        distance = (int) (Math.sqrt((point2.x - point1.x) * (point2.x - point1.x) + (point2.y - point1.y) * (point2.y - point1.y)));
        return distance;
    }
}
