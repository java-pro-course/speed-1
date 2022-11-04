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
                    }
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
       class Triangle extends findDistance  {
           private int P;

           public Triangle(Point p1, Point p2, Point p3) {
               super(p1, p2);

           }



           public void createTriangle(Point p1, Point p2, Point p3) {
               findDistance L1 = new findDistance(p1, p2);
               findDistance L2 = new findDistance(p1, p3);
               findDistance L3 = new findDistance(p2, p3);

               this.P = L1.getLine() + L2.getLine() + L3.getLine();

           }

           public int GetP() {
               return this.P;
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
                System.out.print("print x for point 3: ");
                int x3 = in.nextInt();
                System.out.print("print y for point 3: ");
                int y3 = in.nextInt();

                Point point1 = new Point(x1,y1);
                Point point2 = new Point(x2,y2);
                Point point3 = new Point(x3,y3);

                Triangle triangle = new Triangle(point1, point2, point3 );
                triangle.createTriangle(point1, point2, point3);
                System.out.print("P triangle = ");
                System.out.println(triangle.GetP());


            }
            public static Scanner in = new Scanner(System.in);
        }



