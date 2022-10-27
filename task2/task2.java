package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {

Random random = new Random();
        int middle = 0;
     int[] a = new int[100];
     for (int i = 0; i < a.length; i++){
         a[i] = random.nextInt(100);
         middle += a[i];
     }
     middle /= 100;
        int max =0;
        int min = 0;

      for (int i = 0; i < a.length - 1; i++){
          max = a[i];
          min = a[i];
          if(max < a[i + 1])
              max = a[i + 1];
          if(a[i + 1] < min)
              min  = a[i + 1];
      }

System.out.println("min: " + min +
"\n max: " + max +
"\n middle: " + middle);

    }
    public static void la(int a){
        System.out.println(a);
    }
    public static Scanner in = new Scanner(System.in);
}
