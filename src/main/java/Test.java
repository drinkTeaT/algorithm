import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Description
 * Author liuweibin
 * Date 2020/1/8 10:42
 **/
public class Test {
    public static void main(String[] args) {
//        System.out.println(new Solution().isValid("()"));
        new Stack<>().isEmpty();
    }

}
class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for(int i = 0;i<heights.length;i++){
            int j = i+1;
            while(heights[j] >= heights[i]){
                j++;
            }
            int k = i-1;
            while(heights[k] >= heights[i]){
                k++;
            }
            int temp = j - k - 1;
            if(temp*heights[i] > max){
                max = temp*heights[i];
            }
        }
        return max;
    }
}