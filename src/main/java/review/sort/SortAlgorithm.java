package review.sort;

import org.w3c.dom.ls.LSOutput;
import util.StaticUtil;

import java.util.Arrays;

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
        for (int i : array){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        bubbleSort(StaticUtil.generateArray(100,100));
    }
}
