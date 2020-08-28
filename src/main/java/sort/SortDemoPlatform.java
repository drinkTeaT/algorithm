package sort;


import lombok.AllArgsConstructor;
import util.PrintUtil;
import util.StaticUtil;

import java.util.Arrays;

/**
 * @author EDZ
 * @description
 * @date 2020/8/28 10:01
 */
public class SortDemoPlatform {
    public static void main(String[] args) {
        int[] nums = StaticUtil.generateArray(100, 100);
        PrintUtil.printArray(nums);
        ISortDemo sortDemo = new MergeSortDemo(nums);
        sortDemo.sort();
    }
}

interface ISortDemo {
    /**
     * sort
     */
    void sort();
}

@AllArgsConstructor
class MergeSortDemo implements ISortDemo {
    private int[] nums;

    @Override
    public void sort() {
        split(nums, 0, nums.length-1);
        PrintUtil.printArray(nums);
    }

    private void split(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        int m = l + (r - l) / 2;
        split(nums, l, m);
        split(nums, m + 1, r);
        merge(nums, l, m, r);
    }

    private void merge(int[] nums, int l, int m, int r) {
        int[] copy = nums.clone();
        int nk = l;
        int cl = l;
        int cm = m + 1;
        while (nk <= r) {
            if (cl > m) {
                nums[nk++] = copy[cm++];
            } else if (cm > r) {
                nums[nk++] = copy[cl++];
            } else if (copy[cl] > copy[cm]) {
                nums[nk++] = copy[cm++];
            } else {
                nums[nk++] = copy[cl++];
            }
        }
    }
}

