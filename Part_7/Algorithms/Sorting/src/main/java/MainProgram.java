import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // int[] array = {3, 1, 5, 99, 3, 12};
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array){
        int min = array[0];
        
        for (int i: array) {
            if (i < min) {
                min = i;
            }
        }
        
        return min;
    }
    
    public static int indexOfSmallest(int[] array){
        return indexOfSmallestFrom(array, 0);
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int minIndex = startIndex;
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[minIndex]) {
                minIndex = i;
            }
        }
        
        return minIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        int swapIndex;
        for (int i = 0; i < array.length; i++) {
            swapIndex = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, swapIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
