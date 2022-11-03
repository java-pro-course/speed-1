package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[100];
        input(array);
        System.out.print("It was: ");
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i]);
        }
        sort(array);
        System.out.println("\nIt became: ");
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                System.out.print(array[i]);
            } else {
                System.out.print("\n" + array[i]);
            }
        }
    }

    public static int[] input(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static int[] sort(int[] array){
        int a;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if(array[j] < array[j - 1]){
                    a = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = a;
                }
            }
        }
        return array;
    }
}
