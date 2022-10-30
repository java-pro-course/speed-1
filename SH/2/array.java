package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[100];
        array = input(array);
        System.out.printf("Максимальное число в массиве: %d.\n", max(array));
        System.out.printf("Минимальное число в массиве: %d.\n", min(array));
        System.out.printf("Среднее число в массиве: %d.", average(array));
    }

    public static int[] input(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static int max(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]) max = array[i];
        }
        return max;
    }
    public static int min(int[] array){
        int min = 999;
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]) min = array[i];
        }
        return min;
    }

    public static int average(int[] array){
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        return average/ array.length;
    }
}
