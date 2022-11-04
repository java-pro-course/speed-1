

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
    
        public void setY(int y) {
            this.y = y;
        }
    
        public int getY() {
            return y;
    AOA    }
    }
    
        class  findDistance extends  Point{
            private int line = 0;
    
            public findDistance(Point point1, Point point2) {
                super(point1.getX(), point1.getY());
                this.line = (int)  Math.sqrt(Math.pow (point1.getX() - point2.getX(), 2));
            }
            public int getLine(){
                return this.line;
            }
        }
    
    
    
    public class Main {
        public static void main(String[] args) {
    
            System.out.print("print x for point 1: ");
            int x1 = in.nextInt();
            System.out.print("print y for point 1: ");
            int y1 = in.nextInt();
            System.out.print("print x for point 2: ");
            int x2 = in.nextInt();
            System.out.print("print x for point 2: ");
            int y2 = in.nextInt();
            Point point1 = new Point(x1,y1);
            Point point2 = new Point(x2,y2);
            findDistance findDistance = new findDistance(point1, point2);
            System.out.print("Distance your line: ");
            System.out.print(findDistance.getLine());
        }
        public static Scanner in = new Scanner(System.in);
    }

