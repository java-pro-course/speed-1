import java.util.Scanner;

class Point{
    private int x;
    private int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}

class Triangle{
    private Point A;
    private Point B;
    private Point C;

    Triangle(Point A, Point B, Point C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public static double Perimeter(double AB, double BC, double CA){
        return AB + BC + CA;
    }


}



public class task5 {

    public static double findDistance(Point p1, Point p2){
        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);

        double Perimeter = Triangle.Perimeter(findDistance(p1, p2), findDistance(p2, p3), findDistance(p3, p1));
        System.out.println(Perimeter);
    }
}