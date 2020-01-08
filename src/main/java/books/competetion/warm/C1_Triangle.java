package books.competetion.warm;

/**
 * Description n根棍子长度为a，组成周长最大的三角形。0为不能组成，否则输出最大周长；
 * n[3,100]  a[1,10^6]
 * Author liuweibin
 * Date 2020/1/8 16:10
 **/
public class C1_Triangle {
    public static void main(String[] args) {
        System.out.println(solve(4, new long[]{3, 4, 5, 10}));
    }

    public static long solve(int n, long[] a) {
        for (int i = --n; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if (a[i] < a[j] + a[k]) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                        return a[i] + a[k] + a[j];
                    }
                }
            }
        }
        return 0l;
    }
}
