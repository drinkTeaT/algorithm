package books.competetion.primary;

import java.util.HashMap;
import java.util.Map;

/**
 * Description 给定整数a1,a2...an 判断是否可以选出若干数，使他们和恰好为k
 * n[1,20] ai[-10^8,10^8] k[-10^8,10^8]
 * Author liuweibin
 * Date 2020/1/8 17:17
 **/
public class C1_PartSum {
    static long[] a = new long[]{2, 7, 11, 15};
    static int n = a.length;
    static long k = 9l;

    public static void main(String[] args) {
//        solve();
        System.out.println(twoSum());
    }


    public static void solve() {
        if (dfs(0, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean dfs(int i, long sum) {
        if (i == n) {
            return sum == k;
        }
        if (dfs(i + 1, sum)) {
            return true;
        }
        if (dfs(i + 1, sum + a[i])) {
            return true;
        }
        return false;
    }

    /**
     * 随便取出2个数 看其和相加是否等于目标值
     *
     * @return
     */
    static int[] twoSum() {
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long complement = k - a[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(a[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
