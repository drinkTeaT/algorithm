package demo;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author EDZ
 * @description 递归
 * @date 2020/8/12 14:47
 */
@AllArgsConstructor
public class FabSolution implements ISolution {
    private int n;

    @Override
    public void solution() {
        System.out.println("递归值：" + multiplyNumber(n));
        System.out.println("动态规划值：" + dynamicNumber(n));
    }

    /**
     * n的阶乘即 n!
     */
    private int multiplyNumber(int n) {
        if (n == 1) {
            return n;
        }
        return n * multiplyNumber(n - 1);
    }

    /**
     * n的阶乘即 n! 动态规划
     */
    private int dynamicNumber(int n) {
        int[] nums = new int[n + 1];
        nums[1] = 1;
        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i - 1] * i;
        }
        return nums[n];
    }

}
