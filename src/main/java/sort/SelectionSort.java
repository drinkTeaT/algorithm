package sort;

import java.util.Arrays;

/**
 * @Description：选择排序 <br>
 * 比较次数：n * n
 * 交换次数：n (一个for循环里)
 * @Author： Administrator
 * @Date： 2019-05-03 12:13
 **/
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {12, 3, 54, 23, 55, 1, 32, 65, 4};
        int size = array.length;
        for (int i = 0; i < size; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                minIndex = array[minIndex] > array[j] ? j : minIndex;//   最小的数
            }
            int number = array[i];
            array[i] = array[minIndex];
            array[minIndex] = number;
        }
        Arrays.asList(array).stream().flatMapToInt(Arrays::stream).forEach(System.out::println);
    }
}
