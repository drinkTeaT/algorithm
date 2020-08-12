package demo;

import lombok.AllArgsConstructor;

/**
 * @author EDZ
 * @description Leetcode-70
 * @date 2020/8/12 16:11
 */
@AllArgsConstructor
public class ClimbSolution implements ISolution {
    private int n;

    @Override
    public void solution() {
        long start = System.currentTimeMillis();
        System.out.println(climbStairs(n));
        long end = System.currentTimeMillis();
        System.out.println(dynamicClimb(n));
        long end1 = System.currentTimeMillis();
        System.out.println("递归耗时：" + (end - start) + " 动态规划耗时:" + (end1 - end));
    }

    private int climbStairs(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    private int dynamicClimb(int n) {
        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }
}
