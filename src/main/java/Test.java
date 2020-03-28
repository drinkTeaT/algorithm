import sort.MergeSort;
import util.ListNode;

import java.util.*;

/**
 * Description
 * Author liuweibin
 * Date 2020/1/8 10:42
 **/
public class Test {
    public static void main(String[] args) {
        int[][] a = new int[][]{{4, 5}, {2, 6}, {5, 8}};
        solution(a);
    }

    private static int[][] solution(int[][] a) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(a, (x, y) -> x[0] - y[0]);
        for (int i = 1; i < a.length ; i++) {
            if (a[i][0] <= a[i-1][1]){
                a[i][0] = a[i][0] < a[i-1][0] ? a[i][0] : a[i-1][0];
                a[i][1] = a[i][1] < a[i-1][1] ? a[i-1][1] : a[i][1];
            }else{
                list.add(a[i-1]);
            }
            if (i == a.length - 1){
                list.add(a[i]);
            }
        }
        return list.toArray(new int[0][]);

    }
}
