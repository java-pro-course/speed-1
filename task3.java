

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = 1;
        int[] m = new int[in.nextInt()];
        for (int i = 0; i < m.length;i++){
            m[i] = in.nextInt();
        }
        boolean is = false;

        while(!is) {
            is = true;
            for (int i = m.length - 1; i > 0; i--) {
                if (m[i] > m[i - 1]) {
                    int t = m[i - 1];
                    m[i - 1] = m[i];
                    m[i] = t;
                    is = false;
                }
            }
        }

        for (int i : m){
            System.out.print(i + " ");
        }
    }
}

        //System.out.println(EuclidA(a, b));

