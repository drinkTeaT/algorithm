package books.competetion.primary;

/**
 * Description 给定整数a1,a2...an 判断是否可以选出若干数，使他们和恰好为k
 * n[1,20] ai[-10^8,10^8] k[-10^8,10^8]
 * Author liuweibin
 * Date 2020/1/8 17:17
 **/
public class C1_PartSum {
    public static void main(String[] args) {
        int n = 4;
        long[] a = new long[]{1, 2, 4, 7};
        long k = 11l;
        solve(n, a, k);
    }

    public static void solve(int n, long[] a, long k) {
        if (dfs(a, n, k, 0, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean dfs(long[] a, int n, long k, int i, long sum) {
        if (i == n) {
            return sum == k;
        }
        if (dfs(a, n, k, i + 1, sum)) {
            return true;
        }
        if (dfs(a, n, k, i + 1, sum + a[i])) {
            return true;
        }
        return false;
    }
}
