package sort;

/**
 * 快排
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = MergeSort.generateRandomArray(100,100);
        MergeSort.printArray(a);
        new Solution().solution(a,0,a.length-1);
        MergeSort.printArray(a);
    }

}

class Solution{

    public void solution(int[] nums,int l,int r){
        if(l >= r){
            return;
        }
        int p = partition(nums,l,r);
        solution(nums,l,p-1);
        solution(nums,p+1,r);
    }

    private int partition(int[] nums, int l, int r) {
        // j表示把小的往左移
        int i = 0;
        int j = 0;
        for( i = l,j = l;j < r;j++){
            if(nums[r] >= nums[j]){
                swap(nums,i,j);
                i++;
            }
        }
        swap(nums,i,j);
        return i;
    }

    private void swap(int[] nums,int l,int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}