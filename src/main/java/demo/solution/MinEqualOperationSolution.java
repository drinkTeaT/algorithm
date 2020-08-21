package demo.solution;

import demo.ISolution;
import lombok.AllArgsConstructor;

/**
 * @author EDZ
 * @description 使数组中所有元素相等的最小操作数 1551
 * @date 2020/8/21 17:07
 */
@AllArgsConstructor
public class MinEqualOperationSolution implements ISolution {
    private int n;

    @Override
    public void solution() {
        System.out.println(minOperations(n));
    }

    private int minOperations(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (2 * i) + 1;
        }
        int mid;
        int res = 0;
        int k = 0;
        if (n % 2 == 0) {
            mid = n / 2;
            while (k <= mid - 1) {
                res += a[mid] - 1 - a[k];
                k++;
            }
        } else {
            mid = n / 2;
            while (k <= mid) {
                res += a[mid] - a[k++];
                k++;
            }
        }
        return res;
    }
}
