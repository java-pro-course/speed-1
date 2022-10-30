package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");
        int n = in.nextInt();
        System.out.printf("Делители числа %d:\n", n);
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}
