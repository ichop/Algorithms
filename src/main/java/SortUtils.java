import java.util.Random;

public class SortUtils {
    public static long sortUtils(int elMount, int maxVal, Sorter sorter){
        int[] array = new int[elMount];
        Random random = new Random();
        for (int i = 0; i < elMount; i++) {
            array[i] = random.nextInt(maxVal);
        }
        long startTime = System.currentTimeMillis();
        sorter.sort(array);
        return System.currentTimeMillis() - startTime;
    }
}
