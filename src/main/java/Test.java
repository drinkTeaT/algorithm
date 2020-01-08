import java.util.Arrays;

/**
 * Description
 * Author liuweibin
 * Date 2020/1/8 10:42
 **/
public class Test {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        Arrays.asList(nums1).forEach(System.out::print);
    }

    /**
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
     * 最大数
     * 输入: [3,30,34,5,9]
     * 输出: 9534330
     */
    public static String largestNumber(int[] nums) {
        return null;
    }
}
