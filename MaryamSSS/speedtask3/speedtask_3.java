package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] randoms = new int[100];
        for (int i = 0; i<randoms.length; i++){
            randoms[i] = random.nextInt(100);
            System.out.println(randoms[i]);
        }
        for (int j = 0; j<randoms.length; j++)
            for (int i = 0; i<randoms.length-1; i++){
                if (randoms[i+1] < randoms[i]) {
                    int a = randoms[i];
                    randoms[i] = randoms[i+1];
                    randoms[i+1] = a;
                }
            }
        for (int i = 0; i< randoms.length; i++)
            System.out.println(randoms[i]);
    }
}
