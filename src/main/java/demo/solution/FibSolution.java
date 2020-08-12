package demo.solution;

import demo.ISolution;
import lombok.AllArgsConstructor;

/**
 * @author EDZ
 * @description
 * @date 2020/8/12 15:40
 */
@AllArgsConstructor
public class FibSolution implements ISolution {
    private int n;

    @Override
    public void solution() {
        long start = System.currentTimeMillis();
        System.out.println("递归求值：" + fibonacci(n));
        long end = System.currentTimeMillis();
        System.out.println("动态规划求值：" + dynamicFibonacci(n));
        long end1 = System.currentTimeMillis();
        System.out.println("递归耗时：" + (end - start) + " 动态规划耗时:" + (end1 - end));
    }

    /**
     * 著名的菲波拉契(Fibonacci)数列，其第一项为0，第二项为1，从第三项开始，其每一项都是前两项的和。编程求出该数列前N项数据。
     */
    private long fibonacci(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * 动态规范版本
     *
     * @param n
     * @return
     */
    private long dynamicFibonacci(int n) {
        int[] nums = new int[n + 1];
        nums[1] = 0;
        nums[2] = 1;
        for (int i = 3; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }
}
