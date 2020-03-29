/**
 * Description
 * Author liuweibin
 * Date 2020/1/8 10:42
 **/
public class Test {
    public static void main(String[] args) {
        int[] a = sort.MergeSort.generateRandomArray(100, 100);
        sort.MergeSort.printArray(a);
        new MergeSort().solution(a);
        sort.MergeSort.printArray(a);
    }
}

class QuickSort {
    public void solution(int[] a) {
        quick(a, 0, a.length - 1);
    }

    private void quick(int[] a, int l, int r) {
        if (l >= r) {
            return;
        }
        int p = part(a, l, r);
        quick(a, l, p - 1);
        quick(a, p + 1, r);
    }

    private int part(int[] a, int l, int r) {
        int i = 0;
        int j = 0;
        for (i = l, j = l; j < r; j++) {
            if (a[r] >= a[j]) {
                swap(a, i++, j);
            }
        }
        swap(a, i, j);
        return i;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

class MergeSort {
    public void solution(int[] a) {
        quick(a, 0, a.length - 1);
    }

    private void quick(int[] a, int l, int r) {
        if (l >= r) {
            return;
        }
        int m = l + (r - l) / 2;
        quick(a, l, m);
        quick(a, m + 1, r);
        merge(a,l,r);
    }

    private void merge(int[] a, int l, int r) {
        int m = l + (r - l)/2;
        int[] copy = a.clone();
        int i = l;
        int j = m + 1;
        int k = l;
        while(i <= m && j <= r){
            if(copy[i] > copy[j]){
                a[k++] = copy[j++];
            }else{
                a[k++] = copy[i++];
            }
        }
        while (i <= m){
            a[k++] = copy[i++];
        }
        while (j <= r){
            a[k++] = copy[j++];
        }
    }
}