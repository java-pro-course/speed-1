import java.util.Random;

public class task3 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt();
        }

        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    int count = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = count;
                }
            }
        }

//        for (int i = 0; i < 100; i++) {
//            System.out.println(array[i]);
//        }
    }
}