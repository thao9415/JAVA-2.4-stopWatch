import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.setStartTime();
        System.out.println("Start time: " + sw.getStartTime());
        int[] array = new int[1500];
        Random rd = new Random();
        for (int i = 0; i < 1500; i++) {
            array[i] = rd.nextInt(1500);
        }
        int temp;
        for (int i = 0; i < 1500 - 1; i++) {
            for (int j = 1500 - 1; j >= 1; j--) {

                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        sw.setEndTime();
        System.out.println("End time :"+sw.getEndTime());
        System.out.println(sw.getElapsedTime());
    }
}
