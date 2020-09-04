package offer.easy;

import offer.IOffer;

import java.util.Arrays;

/**
 * @author EDZ
 * @description
 * @date 2020/9/3 14:49
 */
public class Offer42 implements IOffer {
    @Override
    public void solve() {
        String s;
        System.out.println(new Offer42().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public int maxSubArray(int[] nums) {
        Integer[] res = new Integer[nums.length];
        res[0] = nums[0];
        for(int i = 1;i < nums.length;i++){
            res[i] = Math.max(nums[i],res[i-1] + nums[i]);
        }
        Arrays.sort(res,(x, y)->y-x);
        return res[0];
    }
}
