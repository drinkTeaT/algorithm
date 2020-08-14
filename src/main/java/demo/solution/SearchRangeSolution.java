package demo.solution;

import demo.ISolution;
import lombok.AllArgsConstructor;

/**
 * @author EDZ
 * @description leetcode-34 在排序数组查找元素第一个和最后一个位置
 * @date 2020/8/13 14:45
 */
@AllArgsConstructor
public class SearchRangeSolution implements ISolution {
    private int[] nums;
    private int target;

    @Override
    public void solution() {

    }

    private int[] searchRange(int[] nums, int target) {
        int m = nums.length / 2;
        if (nums[m] > target) {

        }
        return null;
    }
}
