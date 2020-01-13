package leetcode;

/**
 * Description
 * Author liuweibin
 * Date 2020/1/8 11:18
 **/
public class BasicCase {
    public static void main(String[] args) {
    }

    /**
     * 有序数组合并，归并排序最后一步
     * 输入:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     * <p>
     * 输出: [1,2,2,3,5,6]
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-- + --n;
        while (n >= 0) {
            nums1[i--] = m >= 0 && nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
    }

    /**
     * 字符串翻转
     *
     * @param str
     * @return
     */
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
