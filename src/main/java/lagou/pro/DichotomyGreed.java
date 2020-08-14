package lagou.pro;

/**
 * @author EDZ
 * @description 二分法和贪婪
 * 二分法时间复杂度为 logn
 * @date 2020/8/13 14:41
 */
public class DichotomyGreed {
    // 34 最长子序列长度

    /**
     * 二分法模板
     *
     * @param nums
     * @param target
     * @param low
     * @param high
     * @return
     */
    private static int binarySearch(int[] nums, int target, int low, int high) {
        // 在 while 循环里，判断搜索的区间范围是否有效
        while (low <= high) {
            // 计算正中间的数的下标
            int middle = low + (high - low) / 2;

            // 判断正中间的那个数是不是要找的目标数 target。如果是，就返回下标 middle
            if (nums[middle] == target) {
                return middle;
            }

            // 如果发现目标数在左边，调整搜索区间的终点为 middle - 1；否则，调整搜索区间的起点为 middle + 1
            if (target < nums[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        // 如果超出了搜索区间，表明无法找到目标数，返回 -1
        return -1;
    }
}
