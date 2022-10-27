
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        Scanner in = new Scanner(System.in);
        List<Integer> a1 = new ArrayList<Integer>();
        int a = r.nextInt();
        //int b = in.nextInt();
        for (int i = 0,c = 0; i < 100; i++){
            a1.add(a);
            c += a;
            if (i == 99){
                System.out.println(c / a1.size());
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
