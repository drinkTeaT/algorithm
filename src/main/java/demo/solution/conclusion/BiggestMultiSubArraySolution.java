package demo.solution.conclusion;

import demo.ISolution;
import lombok.AllArgsConstructor;

/**
 * @author EDZ
 * @description 乘积最大连续子数组 152
 * 输入: [2,3,-2,4]
 * 输出: 6
 * 解释: 子数组 [2,3] 有最大乘积 6。
 * <p>
 * 输入: [0,2,3,-2,4,-1]
 * 输出: 48
 * 解释: 子数组 [2,3,-2,4,-1] 有最大乘积 48。
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
        int[][] res = new int[nums.length][2];
        // 负数值
        res[0][0] = 2;
        // 最大值
        res[0][1] = 2;
        for (int i = 1; i < nums.length; i++) {

        }
        return 0;
    }
}
