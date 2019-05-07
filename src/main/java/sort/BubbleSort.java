package sort;

import java.util.Arrays;

/**
 * @Description：冒泡排序 <br>
 * 比较次数：n * n
 * 交换次数：n * n (嵌套for循环里，拿着一个数去进行交换)
 * @Author： Administrator
 * @Date： 2019-05-03 11:37
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {12, 3, 54, 23, 55, 1, 32, 65, 4};
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        Arrays.asList(array).stream().flatMapToInt(Arrays::stream).forEach(System.out::println);
    }
}
