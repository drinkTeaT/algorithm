package offer.easy;

import offer.IOffer;
import util.PrintUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author EDZ
 * @description
 * @date 2020/9/3 14:10
 */
public class Offer60 implements IOffer {
    private int total;

    public double[] twoSum(int n) {
        Map<Integer, Double> map = new HashMap<>();
        for (int i = n; i <= n * 6; i++) {
            map.put(i, 0d);
        }
        doCalc(new int[]{1, 2, 3, 4, 5, 6}, n, 0, map);
        double[] res = new double[5 * n + 1];
        for (int i = 0; i < 5 * n + 1; i++) {
            res[i] = map.get(i + n) / total;
        }
        return res;
    }

    private void doCalc(int[] nums, int n, int sum, Map<Integer, Double> map) {
        if (n == 0) {
            double v = map.get(sum);
            map.put(sum, v + 1);
            total += 1;
            return;
        }
        for (int i = 0; i < 6; i++) {
            sum += nums[i];
            doCalc(nums, n - 1, sum, map);
            sum -= nums[i];
        }
    }

    @Override
    public void solve() {
        PrintUtil.printArray(new Offer60().twoSum(11));
    }
}
