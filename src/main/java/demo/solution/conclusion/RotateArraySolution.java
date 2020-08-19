package demo.solution.conclusion;

import demo.ISolution;
import lombok.AllArgsConstructor;
import util.PrintUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author EDZ
 * @description 旋转数组 189
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * @date 2020/8/14 11:42
 */
@AllArgsConstructor
public class RotateArraySolution implements ISolution {
    private int[] nums;
    private int k;

    @Override
    public void solution() {
        rotate(nums, k);
    }

    private void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 1) {
            return;
        }
        int[] res = new int[nums.length];
        int realK = k % nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int p = realK + i;
            if (p < nums.length) {
                res[p] = nums[i];
            } else {
                list.add(nums[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        nums = res;
        PrintUtil.printArray(nums);
    }
}
