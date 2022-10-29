import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] mas = new int[100];
        for (int i = 0; i < mas.length; i++){
            mas[i] = ((int)(Math.random()*1000));
        }

        int maxNum = 0;
        for (int i = 0; i < mas.length-1; i++){
            if (mas[i] > mas[i+1])
                maxNum = mas[i];
        }

        int minNum = 0;

        for (int i = 0; i < mas.length-1; i++){
            if (mas[i] < mas[i+1])
                minNum = mas[i];
        }

        int averageValue = 0;
        int sum = 0;
        for (int i = 0; i < mas.length-1; i++){
             sum += mas[i];
        }
        averageValue = sum / 100;

        System.out.println(maxNum);
        System.out.println(minNum);
        System.out.println(averageValue);
    }
    public static Scanner in = new Scanner(System.in);

}
