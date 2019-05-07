package sort;

import java.util.Arrays;

/**
 * @Description：希尔排序
 * @Author： Administrator
 * @Date： 2019-05-04 9:41
 **/
public class ShellSort {
    public static void main(String[] args) {
        int[] array = {12, 3, 54, 23, 55, 1, 32, 65, 4};
        int size = array.length;
//        shellSort(array, array.length);
        myShellSort(array);
        Arrays.asList(array).stream().flatMapToInt(Arrays::stream).forEach(System.out::println);
    }

    private static void shellSort(int array[], int length) {
        int d = length / 2;   //设置希尔排序的增量
        int i;
        int j;
        int temp;
        while (d >= 1) {
            for (i = d; i < length; i++) {
                temp = array[i];
                j = i - d;
                while (j >= 0 && array[j] < temp) {
                    array[j + d] = array[j];
                    j = j - d;
                }
                array[j + d] = temp;
            }
            d = d / 2;    //缩小增量
        }
    }

    private static void myShellSort(int[] arr) {
        int h = 1;
        int outer, innner;
        int temp;
        while (h <= arr.length) {// 递增序列（1,4,13,40,121，...）
            h = 3 * h + 1;
        }
        while (h > 0) {// 递减直到 h = 1
            for (outer = h; outer < arr.length; outer++) {
                temp = arr[outer];
                innner = outer;
                while (innner > h - 1 && arr[innner - h] >= temp) {// 0,4,8,..
                    arr[innner] = arr[innner - h];
                    innner -= h;
                }
                arr[innner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}
