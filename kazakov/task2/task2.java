import java.util.Random;

public class task2 {

    public static void main(String[] args) {
        int[] array = new int[100];
        int countMin = 0;
        int countMax = 0;
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            count += array[i];
            if(array[i] < countMin){
                countMin = array[i];
            }
            if(array[i] > countMax){
                countMax = array[i];
            }
        }

        System.out.println(countMax);
        System.out.println(countMin);
        System.out.println(count/ array.length);
    }
}