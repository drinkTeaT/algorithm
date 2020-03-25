package lagou.base;



/**
 * 归并排序和快速排序
 */
public class SortLeetCode {
}

/**
 * 归并排序的合并共有四种情况，1 左边全部比较完 2 右边全部比较完 3 都没比较完且左大于右 4 都没比较完且右大于左
 */
class Merge {
    public static void main(String[] args) {
        int[] a = new int[]{41, 2, 22, 352, 4226, 32, 22, 62};
        solution(a, 0, a.length - 1);
        System.out.println("hello world");
    }

    public static void solution(int[] a, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        // 左右侧
        solution(a, 0, mid);
        solution(a, mid + 1, high);
        merge(a, low, mid, high);
    }

    private static void merge(int[] a, int low, int mid, int high) {
        int[] b = a.clone();
        int l = low;
        int m = mid + 1;
        int k = low;
        while (k <= high) {
            if (l > mid) {
                a[k++] = b[m++];
            } else if (m > high) {
                a[k++] = b[l++];
            } else if (b[l] < b[m]) {
                a[k++] = b[l++];
            } else {
                a[k++] = b[m++];
            }
        }
    }
}

/**
 * 215
 * 找到基准值，然后把小与它的放左边大于的放右边。也是用的分治
 */
class Quick{

}