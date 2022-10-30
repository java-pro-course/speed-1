package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] randoms = new int[100];
        Random random = new Random();
        int m = 0;
        int min = 100;
        int max = 0;
        for (int i = 1; i<randoms.length; i++){
            randoms[i] = random.nextInt(100);
            min=randoms[i];
            System.out.println(randoms[i]);
        }
        for (int i = 1; i<randoms.length; i++){
            if (randoms[i]>max)
                max=randoms[i];
            if (randoms[i]<min)
                min=randoms[i];
            m=m+randoms[i];
        }
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
        System.out.println("Среднее арифметическое: " + m/randoms.length);
    }
}
