
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

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
    public int findDistance(Point point1, Point point2){
        int line = 0;
        line = (int)  Math.sqrt(Math.pow (point1.x - point2.x, 2));
        return line;
    }
}




public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(1,1);
        Point point2 = new Point(2,2);
        System.out.println( point1.findDistance(point1, point2));
    }
}