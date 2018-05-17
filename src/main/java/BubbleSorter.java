public class BubbleSorter implements Sorter {

    @Override
    public void sort(int[] array){
        int var;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    var = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = var;
                }
            }
        }
    }

    @Override
    public String getAlgorithmName(){
        String name = "Bubble Sort";
        return name;
    }
}
