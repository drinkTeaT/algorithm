package sort;

import java.util.Arrays;

/**
 * @Description：插入排序 <br>
 * 出队，比较，移动，进队。
 * @Author： Administrator
 * @Date： 2019-05-03 21:12
 **/
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {12, 3, 54, 23, 55, 1, 32, 65, 4};
        int size = array.length;
        for (int i = 0; i < size; i++) {// 比较的那个人
            int mark = array[i];
            int j = i;
            while (j >= 1 && mark < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = mark;
        }
        Arrays.asList(array).stream().flatMapToInt(Arrays::stream).forEach(System.out::println);
    }
}
