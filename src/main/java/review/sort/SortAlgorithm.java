package review.sort;

import util.StaticUtil;

/**
 * Description 排序算法复习
 * Author liuweibin
 * Date 2019/12/27 16:02
 **/
public class SortAlgorithm {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        printArray(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int mark = array[i];
            int j = i;
            while (j > 0 && mark < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = mark;
        }
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] array = StaticUtil.generateArray(100, 100);
        bubbleSort(array);
        insertionSort(array);
    }
}
