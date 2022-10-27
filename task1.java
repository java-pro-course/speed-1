

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        //int b = in.nextInt();
        for (int i = 1; i <= a; i++){
            if (a % i == 0){
                System.out.println(i);
            }
        }
        //System.out.println(EuclidA(a, b));


    }
//    public static int EuclidA(int a, int b){
//        if (b == 0){
//            return a;
//        }
//        return EuclidA(b, a % b);
//    }
}
