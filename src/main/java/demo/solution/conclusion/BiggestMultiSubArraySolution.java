package demo.solution.conclusion;

import demo.ISolution;
import lombok.AllArgsConstructor;

/**
 * @author EDZ
 * @description 乘积最大连续子数组
 * 输入: [2,3,-2,4]
 * 输出: 6
 * 解释: 子数组 [2,3] 有最大乘积 6。
 * @date 2020/8/14 11:25
 */
@AllArgsConstructor
public class BiggestMultiSubArraySolution implements ISolution {
    private int[] nums;

    @Override
    public void solution() {
        System.out.println(maxProduct(nums));
    }

    private int maxProduct(int[] nums) {
        int max = nums[0];
        int i = 0;
        while (++i < nums.length) {
            int value = nums[i] * nums[i - 1];
            max = max > value ? max : value;
        }
        return max;
    }
}
