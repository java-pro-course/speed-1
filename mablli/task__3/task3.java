import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] mas = new int[100];
        for (int i = 0; i < mas.length; i++){
            mas[i] = ((int)(Math.random()*100));
        }

        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    temp = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = temp;
                }
            }
        }
        for (int i = 0; i< mas.length; i++)
            System.out.println(mas[i]);
    }
    public static Scanner in = new Scanner(System.in);

}
